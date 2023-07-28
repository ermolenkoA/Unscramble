package com.example.android.unscramble.ui.game

import android.text.Spannable
import android.text.SpannableString
import android.text.style.TtsSpan
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map

class GameViewModel: ViewModel() {

    val score: LiveData<Int>
        get() = _score
    val currentWordCount: LiveData<Int>
        get() = _currentWordCount

    private val _score = MutableLiveData(0)
    private val _currentWordCount = MutableLiveData(0)
    private var wordsList: MutableList<String> = mutableListOf()
    private val _currentScrambledWord = MutableLiveData<String>()
    private lateinit var currentWord: String

    val currentScrambledWord: LiveData<Spannable> = _currentScrambledWord.map {
        if (it == null) {
            SpannableString("")
        } else {
            val scrambledWord = it.toString()
            val spannable: Spannable = SpannableString(scrambledWord)
            spannable.setSpan(
                TtsSpan.VerbatimBuilder(scrambledWord).build(),
                0,
                scrambledWord.length,
                Spannable.SPAN_INCLUSIVE_INCLUSIVE
            )
            spannable
        }
    }
        init {
        getNextWord()
        SpannableString("")
    }

    fun nextWord(): Boolean {
        return if (_currentWordCount.value!! < MAX_NO_OF_WORDS) {
            getNextWord()
            true
        } else false
    }

    fun reinitializeData() {
        _score.value = 0
        _currentWordCount.value = 0
        wordsList.clear()
        getNextWord()
    }

    fun isUserWordCorrect(playerWord: String): Boolean {
        if (playerWord.equals(currentWord, true)) {
            increaseScore()
            return true
        }
        return false
    }

    private fun increaseScore() {
        _score.value = (_score.value)?.plus(SCORE_INCREASE)
    }

    private fun getNextWord() {
        do {
            currentWord = allWordsList.random()
        } while (wordsList.contains(currentWord))

        val tempWord = currentWord.toCharArray()

        do {
            tempWord.shuffle()
        } while (String(tempWord).equals(currentWord, false))

        _currentScrambledWord.value = String(tempWord)
        _currentWordCount.value = (_currentWordCount.value)?.inc()
        wordsList.add(currentWord)
        Log.d("WORD", currentWord)
    }
}