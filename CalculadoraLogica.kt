package com.example.studykotlin


import java.util.*

fun main() {
    val reader = Scanner(System.`in`)
    val simbolo = reader.next()
    val a = reader.nextInt()
    val b = reader.nextInt()


    when (simbolo) {
        "+" -> print("${soma(a, b)}")
        "-" -> print("${subtrair(a, b)}")
        "/" -> print("${divisao(a, b)}")
        "*" -> print("${multiplicar(a, b)}")
        else -> "Error 404"
    }
}

fun soma(a: Int, b: Int) = a + b

fun multiplicar(a: Int, b: Int) = a * b


fun subtrair(a: Int, b: Int) = a - b

fun divisao(a: Int, b: Int) = a / b






