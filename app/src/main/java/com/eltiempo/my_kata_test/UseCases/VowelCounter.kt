package com.eltiempo.my_kata_test.UseCases

import java.util.*

class VowelCounter {

    val MAX_NUM_CHARACTERS_ALLOWED = 20
    private val listOfVowels = listOf<String>("a","e","i","o","u")
    private var counter = 0

    fun count(word : String) : Any{

        if (word.isEmpty())return 0

        if (word.length > MAX_NUM_CHARACTERS_ALLOWED)
            @Suppress("UNREACHABLE_CODE")
            return throw IndexOutOfBoundsException()


        word.toLowerCase(Locale.ROOT).forEach {
            if (listOfVowels.contains(it.toString()))counter++
        }

        return counter
    }
}