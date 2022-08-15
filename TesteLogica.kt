package com.example.studykotlin

import java.util.*

fun main () {
    val reader = Scanner(System.`in`)
    // val count: Int = 35
    val count = reader.nextInt()
    if (count == 42) {
        println("I have the answer.")
    } else if  (count <= 39) {
        println("The answer eludes me.")
    }
}