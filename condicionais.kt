package com.example.studykotlin

import java.util.*

fun main() {

    val reader = Scanner(System.`in`)
    val idade = reader.nextInt()
    val testeString: String = if (idade == 42) {
        "Você tem essa idade"
    } else if (idade < 42) {
        "Você ainda está jovem"
    } else {
        "Você não tem nenhuma dessa idade"
    }
    println(testeString)
}