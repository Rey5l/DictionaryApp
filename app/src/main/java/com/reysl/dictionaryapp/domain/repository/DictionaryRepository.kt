package com.reysl.dictionaryapp.domain.repository

import com.reysl.dictionaryapp.domain.model.WordItem
import com.reysl.dictionaryapp.util.Result
import kotlinx.coroutines.flow.Flow

interface DictionaryRepository {
    suspend fun getWordResult(
        word: String
    ): Flow<Result<WordItem>>
}