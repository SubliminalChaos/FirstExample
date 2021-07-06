package me.waqe.hariri.basics

fun main() {
    // in kotlin everything is an object.
    val myLong = 10L // L, F, 0x, 0xb are literal constants
    // no explicit conversion
    val myInt = 100
    val myLongAgain: Long = myInt.toLong()  // must call conv function

    val mutlipleLines = """
        This is a string
        and this is a second line
    """.trimIndent()

    // string interpolation
    val years = 10
    val message = "A decade is $years years"

    val name = "Sarah"
    val anotherMessage = "Length of name is ${name.length}"
}