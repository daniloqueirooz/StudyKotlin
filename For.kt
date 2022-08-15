package com.example.studykotlin


fun main() {
    for (i in 1..50) {
        if (i % 5 == 0) {
            continue
        }

        print("$i")
    }

    // for (j in 50 downTo 0) {
    // print("$j")
    //  }
}
