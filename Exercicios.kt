package com.example.studykotlin

import java.util.*

fun main() {
    val reader = Scanner(System.`in`)
    val verificar = reader.nextInt()

    when (verificar) {
        in 10..Int.MAX_VALUE -> println("esse número é 10!")
        in 0..10 -> println("número menor que 10!")

    }
}

