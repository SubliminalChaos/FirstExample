package me.waqe.hariri.classes

// global read only object (basically singleton pattern)
object Global {
    val PI = 3.14
}

fun main() {
    val localObject = object {
        val PI = 3.14159
    }

    println(Global.PI)
}
