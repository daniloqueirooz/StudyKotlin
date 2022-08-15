package com.example.studykotlin

fun main (){

    // val str: String = "Desenvolvimento Android com Kotlin"
    val str: String = "AMANDA, PAULA, LARA, ALACA, RUCA, AUSTRALIA"

    println("O tamanho dessa string é > ${str.length}")

    println("O Valor do cubo de um número inteiro é Cubo > ${divisao(3,3, 3)}")

    println(str.replace("A", "x", true).lowercase())


}

fun divisao (a: Int, b: Int, c: Int) : Int {
    return  (a * b * c)
}
