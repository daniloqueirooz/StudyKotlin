package com.example.studykotlin

import java.util.*

fun main() {
    val reader = Scanner(System.`in`)
    var N = reader.nextInt()

    do {

        val I = reader.nextInt()´

        if (I > 7) {
            println("UP")
        } else if (I < 7) {
            println("DOWN")
        } else if (I == 7) {
            println("EQUAL")

        }

        N--


    } while (N != 0)


}
