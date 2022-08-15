package com.example.studykotlin
/*
fun main () {
    HelloWord()
}

fun HelloWord() {
    println("Olá, Danilo Queiroz")
}*/

fun main() {
// val soma = soma(23, 23)
    println(divisao(10f, 3.5f))
    println("A soma de 23 mais 23 é >>>  ${soma(23, 23)}")
}

fun soma(a: Int, b: Int): Int {
    return (a + b)
}

// apenas comentando, instrunção é quando você apenas (processador executa)
// quando você faz uma chamada.

fun divisao(a: Float, b: Float): Float {
    return a / b

}
