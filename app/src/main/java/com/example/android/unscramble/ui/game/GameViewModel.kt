package com.example.android.unscramble.ui.game

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel: ViewModel() {
    val currentScrambledWord: String
        get() = _currentScrambledWord
    val score: Int
        get() = _score
    val currentWordCount: Int
        get() = _currentWordCount

    private var _score = 0
    private var _currentWordCount = 0
    private  var wordsList: MutableList<String> = mutableListOf()
    private lateinit var _currentScrambledWord: String
    private lateinit var currentWord: String

    init {
        getNextWord()
        Log.d("GameFragment", "GameViewModel created!")
    }

    fun nextWord(): Boolean {
        return if (currentWordCount < MAX_NO_OF_WORDS) {
            getNextWord()
            true
        } else false
    }

    fun reinitializeData() {
        _score = 0
        _currentWordCount = 0
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
        _score += SCORE_INCREASE
    }

    private fun getNextWord() {
        do {
            currentWord = allWordsList.random()
        } while (wordsList.contains(currentWord))

        val tempWord = currentWord.toCharArray()

        do {
            tempWord.shuffle()
        } while (String(tempWord).equals(currentWord, false))

        _currentScrambledWord = String(tempWord)
        ++_currentWordCount
        wordsList.add(currentWord)
    }
}