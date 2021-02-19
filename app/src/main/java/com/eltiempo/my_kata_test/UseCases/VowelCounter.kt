package com.eltiempo.my_kata_test.UseCases

class VowelCounter {

    private val MAX_NUM_CHARACTERS_ALLOWED = 20
    private val listOfVowels = listOf<String>("a","e","i","o","u")
    private var counter = 0

    fun count(word : String) : Any{

        if (word.isEmpty())return 0

        if (word.length > MAX_NUM_CHARACTERS_ALLOWED) {
            return throw IndexOutOfBoundsException()
        }

        for (vowel in  listOfVowels){

            for (character in word.toLowerCase()){

                if (vowel.equals(character)) {
                    counter++
                }

            }

        }

        return counter
    }
}