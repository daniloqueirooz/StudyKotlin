package com.example.studykotlin

// funções de String

fun main () {
    val str = "Inicio a programação de Kotlin"

    println("O tamanho desse String é ${str.length}")
    println("Posição (index) 0 da string: ${str[0]}")
    println(str.startsWith("Ini"))
    println(str.endsWith("Hello Word"))
    println(str.substring(5,6))
    println(str.replace("Kotlin", "Kotlin é show"))
    println(str.lowercase())
    println(str.uppercase())



}

//length serve para ver o tamanho de uma String
// pressionar contra Q
// startsWith, pra ver com o que começa
// shift + esc