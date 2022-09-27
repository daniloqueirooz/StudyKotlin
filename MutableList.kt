fun main() {
    val entrees = mutableListOf<String>()

    println("Entradas: $entrees")

    // Adiciona itens individuais usando add()
    println("Adicionar macarrão: ${entrees.add("macarrão")}")
    println("Entradas: $entrees")
    println("Adicionar espaguete: ${entrees.add("espaguete")}")
    println("Entradas: $entrees")

    // Adiciona uma lista de itens usando addAll()
    val moreItems = listOf("ravioli", "lasanha", "fettuccine")
    println("Adicionar lista: ${entrees.addAll(moreItems)}")
    println("Entradas: $entrees")

    // Remove um item usando remove()
    println("Remover espaguete: ${entrees.remove("espaguete")}")
    println("Entradas: $entrees")
    println("Remover item que não existe: ${entrees.remove("arroz")}")
    println("Entradas: $entrees")

    // Remove um item usando removeAt() com um índice
    println("Remover primeiro elemento: ${entrees.removeAt(0)}")
    println("Entradas: $entrees")

    //Limpa a lista
    entrees.clear()
    println("Entradas: $entrees")

    // Verifica se a lista está vazia
    println("Vazio? ${entrees.isEmpty()}")
}