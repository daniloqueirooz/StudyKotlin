package com.example.fastapp

fun main() {
    val peoplesAge = mutableMapOf(
        "Fred" to 30, "Marcely" to 25
    )

    peoplesAge["Barbara"] = 42
    peoplesAge["Joe"] = 51
    println(peoplesAge)

    // Tipos de coleção têm muitos comportamentos em comum.
    // Se forem mutáveis, você poderá adicionar ou remover itens

    // peoplesAge.forEach{ print("${it.key} is ${it.value}, ") }

    // println(peoplesAge.map { "${it.key} is ${it.value}" }.joinToString( " , ") )

    val filteredNames = peoplesAge.filter { it.key.length < 4 }
    println(filteredNames)

}