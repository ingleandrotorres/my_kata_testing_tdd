package com.eltiempo.my_kata_test.UseCases

import org.junit.Assert.*
import org.junit.Test

class VowelCounterTest {

    @Test
    fun `validate when input is empty`() {

        //given
        val word = ""
        //when

        val vC = VowelCounter()
        val numberOfVowel = vC.count(word)
        //then
        assertEquals(numberOfVowel, 0)
    }

    @Test
    fun `throw an error when string is greater than 20 characters`() {

        //given
        val word = "this string has a lot of characters"

        try {
            //when
            val numberOfVowel = VowelCounter().count(word)
            fail("expected exception was not occurred")
            //then
        } catch (e: IndexOutOfBoundsException) {
            //if execution reaches here, it indicates this exception was occured. so we need not handle it.
        }
    }

    @Test

    fun success_scenario(){

        //given
        val word = "It has 4 vowels"
        //when
        val vC = VowelCounter()
        val numberOfVowel = vC.count(word)
        //then
        assertEquals(numberOfVowel, 4)

    }

}