package com.eltiempo.my_kata_test.UseCases

import junit.framework.TestCase
import org.junit.Test

class VowelCounterTest : TestCase(){

    @Test
    fun `validate when input is empty`(){

        //given
        val word = ""
        //when

        val vC = VowelCounter()
        val numberOfVowel = vC.count(word)
        //then
        assertEquals(numberOfVowel,0)
    }

}