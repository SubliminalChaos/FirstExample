package me.waqe.hariri.basics

fun main() {
    for (a in 1..100) {  // inferred type  // .. is operator overload for rangeTo
        println(a)       // .toString is implicit
    }

    val numbers = 1..100
    for (a in numbers) println(a)

    for (a in 100 downTo 1) println(a)
    for (b in 100 downTo 1 step 5) println(b)

    val capitals = listOf("Madrid", "Berlin", "Warsaw")
    for (capital in capitals) println(capital)

    do {
        var x = 10
        x--
    } while (x > 0)

    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j % i == 0) {
                break@loop
            }
        }
    }


}