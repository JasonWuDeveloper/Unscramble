package com.example.android.unscramble.ui.game

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel:ViewModel() {

    init {
        Log.d("GameViewModel", "GameViewModel created!")
        getNextWord()
    }


    private var wordsList: MutableList<String> = mutableListOf()
    private lateinit var currentWord: String
    private var _count = 0
    val count: Int
        get() = _count
    private var score = 0
    private var currentWordCount = 0
    private var _currentScrambledWord = "test"
    val currentScrambledWord: String
        get() = _currentScrambledWord

    private fun getNextWord() {
        currentWord = allWordsList.random()
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("GameViewModel","GameViewModel destroyed!")
    }
}

