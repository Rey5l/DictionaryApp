package com.reysl.dictionaryapp.data.mapper

import com.reysl.dictionaryapp.data.dto.DefinitionDto
import com.reysl.dictionaryapp.data.dto.MeaningDto
import com.reysl.dictionaryapp.data.dto.WordItemDto
import com.reysl.dictionaryapp.domain.model.Definition
import com.reysl.dictionaryapp.domain.model.Meaning
import com.reysl.dictionaryapp.domain.model.WordItem


fun WordItemDto.toWordItem() = WordItem (
    word = word ?: "",
    meanings = meanings?.map {
        it.toMeaning()
    } ?: emptyList(),
    phonetic = phonetic ?: ""
)


fun MeaningDto.toMeaning() = Meaning(
    definition = definitionDtoToDefinition(definitions?.get(0)),
    partOfSpeech = partOfSpeech ?: ""
)

fun definitionDtoToDefinition(definitionDto: DefinitionDto?) = Definition(
    definition = definitionDto?.definition ?: "",
    example = definitionDto?.example ?: ""
)