package com.eltiempo.my_kata_test.UseCases

class VowelCounter {

    private val MAX_NUM_CHARACTERS_ALLOWED = 20

    fun count(word : String) : Any{

        if (word.isEmpty())return 0

        if (word.length > MAX_NUM_CHARACTERS_ALLOWED) {
            return throw IndexOutOfBoundsException()
        }
        return 0
    }
}