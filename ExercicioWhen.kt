package com.example.studykotlin

fun bonus(cargo: String): Float {
    return if (cargo == "Gerente") {
        2000f
    } else if (cargo == "Coordenador") {
        1500f
    } else if (cargo == "Engenheiro de Software") {
        1000f

    } else if (cargo == "Estagiario") {
        500f
    } else {
        0f
    }
}

fun bonusWhen(cargo: String): Float {
    return when (cargo) {
        "Gerente" -> 2000f
        "Coordenador" -> 1500f
        "Engenheiro de Software" -> 1000f
        "Estagiario" -> 500f
        else -> 0f
    }
}

fun main () {
    bonusWhen("adjhajdhjadhja")
}