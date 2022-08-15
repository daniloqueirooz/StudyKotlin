package com.example.studykotlin

fun portaria() {
    println("Qual a sua idade?")
    val idade = readLine()
    if (idade != null && idade != "") {
        if (idade.toInt() < 18) {
            println("Negado. Menores de idade não são permitidos.:(Quem sabe o pŕoximo ano?")
            return
        }

        println("Qual é o tipo de convite?")
        var tipodeConvite = readLine()

        if (tipodeConvite != null && tipodeConvite != "") {
            tipodeConvite = tipodeConvite.lowercase()

            if (tipodeConvite != "comum" && tipodeConvite != "premium" && tipodeConvite != "luxo") {
                println("Negado, convite invalido :(")
                return

            }
            if (tipodeConvite == "comum" || tipodeConvite == "premium" || tipodeConvite == "luxo") {

                println("Qual o seu codigo do convite?")
                var codigo = readLine()

                if (codigo != null && codigo != "") {
                    codigo = codigo.lowercase()
                    if (tipodeConvite == "comum" && codigo.startsWith("xt")) {
                        println("Welcome :)")

                    } else if (tipodeConvite == "premium" || tipodeConvite == "luxo"
                        && codigo.startsWith("xl")

                    ) {
                        println("Welcome :)")

                    }
                } else {
                    println("Negado. Convite invalido")
                }
            } else {
                println("Negado, convite invalido")
                return
            }
        }
    }
}

fun main() {
    portaria()
}
