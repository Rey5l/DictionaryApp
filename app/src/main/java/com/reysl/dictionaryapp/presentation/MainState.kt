package com.reysl.dictionaryapp.presentation

import com.reysl.dictionaryapp.domain.model.WordItem

data class MainState(
    val isLoading: Boolean = false,
    val searchWord: String = "",

    val wordItem: WordItem? = null
)
