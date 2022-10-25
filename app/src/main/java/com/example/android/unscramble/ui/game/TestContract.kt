package com.example.android.unscramble.ui.game

interface TestContract {
    interface View {
        fun updateNextWordOnScreen(currentScrambleWord: String)
        fun setErrorTextField(error: Boolean)
        fun updateSubmitWord(currentWordCount: Int,score: Int)
        fun updateSkipWord(currentWordCount: Int)
    }

    interface Presenter {
        fun onNextWordOnScreen()
        fun onSubmitWord()
        fun onSkipWord()
    }
}