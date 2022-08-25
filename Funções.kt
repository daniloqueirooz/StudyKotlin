package com.example.studykotlin

import java.util.*

fun main() {
    print(max(10, 5))
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b


}