package com.reysl.dictionaryapp.presentation

sealed class MainUiEvents {
    data class OnSearchWordChange(
        val newWord: String
    ) : MainUiEvents()

    data object OnSearchClick : MainUiEvents()
}