package com.example.android.unscramble.ui.game

import android.content.Context

class TestPresenter(_view: TestFragment) : TestContract.Presenter {
    private val view: TestContract.View = _view

    private var score = 0
    private var currentWordCount = 0
    private var currentScrambledWord = "test"

    override fun onSkipWord() {
        currentScrambledWord = getNextScrambledWord()
        currentWordCount++
        view.updateSkipWord(currentWordCount)
        view.setErrorTextField(false)
        view.updateNextWordOnScreen(currentScrambledWord)
    }
    override fun onSubmitWord() {
        currentScrambledWord = getNextScrambledWord()
        currentWordCount++
        score += SCORE_INCREASE
        view.setErrorTextField(false)
        view.updateSubmitWord(currentWordCount, score)
        view.updateNextWordOnScreen(currentScrambledWord)
    }

    override fun onNextWordOnScreen() {
       view.updateNextWordOnScreen(getNextScrambledWord())
    }
    private fun restartGame() {
        view.setErrorTextField(false)
      view.updateNextWordOnScreen(currentScrambledWord)
    }

    private fun getNextScrambledWord(): String {
        val tempWord = allWordsList.random().toCharArray()
        tempWord.shuffle()
        return String(tempWord)
    }
}