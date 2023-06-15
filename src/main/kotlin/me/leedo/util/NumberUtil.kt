package me.leedo.util

import kotlin.random.Random

class NumberUtil {

    fun randomNumber(): Int {
        return Random(10).nextInt()
    }
}