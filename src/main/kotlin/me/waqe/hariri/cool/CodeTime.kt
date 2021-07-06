package me.waqe.hariri.cool

import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis

fun main() {


// done inline - you don't pay the cost of the lambda
    val helloTook = measureNanoTime {
        println("Hello, world!")
    }

    println("Saying \"Hello, world!\" took ${helloTook}ns.")
    testTodo()
}

fun testTodo() {
    // (-: TODO("Not yet implemented")
}
