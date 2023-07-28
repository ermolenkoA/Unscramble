/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.unscramble.ui.game

import java.util.Locale


const val MAX_NO_OF_WORDS = 10
const val SCORE_INCREASE = 20

// List with all the words for the Game
val allWordsList: () -> List<String> = {
        if (Locale.getDefault().language == "ru")
            rusWordsList
        else
            engWordsList
    }



val rusWordsList: List<String> = listOf(
        "животное", "авто", "анекдот", "алфавит", "все",
        "потрясающий", "вырезать", "вертолёт", "корзина", "скамейка",
        "лучший", "праздник", "книга", "портфель", "камера",
        "кемпинг", "свечка", "кошка", "капуста", "чат",
        "домовой", "красный", "классический", "классный", "кофейный",
        "красочный", "печенье", "творческий", "круиз", "танец",
        "подиум", "динозавр", "клавиатура", "крыса", "мечтать",
        "сумерки", "крот", "слон", "изумруд", "жуткий",
        "электрический", "финиш", "цветы", "коляска", "лиса",
        "рамка", "свободный", "частый", "крышка", "зеленый",
        "гитара", "бакалея", "стакан", "великолепно", "шторм",
        "стрижка", "половина", "картошка", "случается", "милая",
        "спешить", "сотня", "лед", "иглу", "инвестировать",
        "пригласить", "значок", "познакомить", "пошутить", "веселый",
        "журнал", "прыжок", "присоединение", "кенгуру", "телефон",
        "кухня", "коала", "добрая", "калейдоскоп", "пейзаж",
        "поздно", "смех", "учеба", "лимон","письмо",
        "лилия", "кассета", "морской", "зефир", "лабиринт",
        "медитировать", "мелодия", "минута", "памятник", "луна",
        "мотоцикл", "гора", "музыка", "север", "нос",
        "ночь", "имя", "никогда", "договориться", "число",
        "напротив", "осьминог", "дуб", "порядок", "открытый",
        "полярный", "стая", "живопись", "человек", "пикник",
        "подушка", "пицца", "подкаст", "презентация", "щенок",
        "головоломка", "рецепт", "выпуск", "ресторан", "вращаться",
        "перемотка", "комната", "бег", "секрет", "ручка",
        "корабль", "рубашка", "должен", "маленький", "карандаш",
        "небо", "мастерство", "улица", "стиль", "восход", "такси",
        "номер", "таймер", "вместе", "зуб", "турист", "путешествие",
        "грузовик", "съезд", "полезный", "единорог", "уникальный", "поднять",
        "мундир", "ваза", "скрипка", "гость", "видение",
        "объем", "вид", "морж", "бродить", "мир",
        "зима", "колодец", "вихрь", "рентген", "ксилофон",
        "йога", "йогурт", "почтальон", "ты", "год", "вкусняшка",
        "зебра", "зигзаг", "зоология", "зона", "труд"
)
val engWordsList: List<String> =
    listOf(
        "animal", "auto", "anecdote", "alphabet", "all",
        "awesome", "arise", "balloon", "basket", "bench",
        "best", "birthday", "book", "briefcase", "camera",
        "camping", "candle", "cat", "cauliflower", "chat",
        "children", "class", "classic", "classroom", "coffee",
        "colorful", "cookie", "creative", "cruise", "dance",
        "daytime", "dinosaur", "doorknob", "dine", "dream",
        "dusk", "eating", "elephant", "emerald", "eerie",
        "electric", "finish", "flowers", "follow", "fox",
        "frame", "free", "frequent", "funnel", "green",
        "guitar", "grocery", "glass", "great", "giggle",
        "haircut", "half", "homemade", "happen", "honey",
        "hurry", "hundred", "ice", "igloo", "invest",
        "invite", "icon", "introduce", "joke", "jovial",
        "journal", "jump", "join", "kangaroo", "keyboard",
        "kitchen", "koala", "kind", "kaleidoscope", "landscape",
        "late", "laugh", "learning", "lemon", "letter",
        "lily", "magazine", "marine", "marshmallow", "maze",
        "meditate", "melody", "minute", "monument", "moon",
        "motorcycle", "mountain", "music", "north", "nose",
        "night", "name", "never", "negotiate", "number",
        "opposite", "octopus", "oak", "order", "open",
        "polar", "pack", "painting", "person", "picnic",
        "pillow", "pizza", "podcast", "presentation", "puppy",
        "puzzle", "recipe", "release", "restaurant", "revolve",
        "rewind", "room", "run", "secret", "seed",
        "ship", "shirt", "should", "small", "spaceship",
        "stargazing", "skill", "street", "style", "sunrise", "taxi",
        "tidy", "timer", "together", "tooth", "tourist", "travel",
        "truck", "under", "useful", "unicorn", "unique", "uplift",
        "uniform", "vase", "violin", "visitor", "vision",
        "volume", "view", "walrus", "wander", "world",
        "winter", "well", "whirlwind", "x-ray", "xylophone",
        "yoga", "yogurt", "yoyo", "you", "year", "yummy",
        "zebra", "zigzag", "zoology", "zone", "zeal"
    )
