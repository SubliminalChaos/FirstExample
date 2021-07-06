package me.waqe.hariri.basics

fun main() {
    var myString = "Not empty"


    if (myString != "") {
        println("Not empty")
    } else {
        println("Is empty")
    }

    var result = if (myString != "") {
        "Not empty"
    } else {
        "Empty"
    }
    println(result)

    result = "Empty"
    when (result) {
        is String -> println("Excellent")  // breaks on first hit
        "Empty" -> println("Boo")          // prints Excellent
        "Not empty" -> {
            println("Our string is not empty!")
            println("Yippee!")
        }
    }

    result = "Not empty"
    val whenResult = when (result) {
        is String -> println("Excellent")  // breaks on first hit
        "Empty" -> println("Boo")          // prints Excellent
        "Not empty" -> {
            println("Our string is not empty!")
            println("Yippee!")
        }
        else -> println("Rats!")
    }

}