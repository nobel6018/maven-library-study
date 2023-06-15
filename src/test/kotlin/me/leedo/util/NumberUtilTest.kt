package me.leedo.util

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class NumberUtilTest {

    @Test
    fun testRandomNumber() {
        val numberUtil = NumberUtil()
        val randomNumber = numberUtil.randomNumber()
        println(randomNumber)
        assertThat(randomNumber).isNotNull()
    }
}