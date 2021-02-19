package com.eltiempo.my_kata_test.UseCases

class VowelCounter {

    fun count(word : String) : Any{

        if (word.isEmpty())return 0

        if (word.length > 10) {
            return throw IndexOutOfBoundsException()
        }
        return 0
    }
}