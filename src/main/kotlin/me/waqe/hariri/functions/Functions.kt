package me.waqe.hariri.functions

// function that returns Unit - kinda like an object that we can compare to
// ie, if the function is returning unit then do something
fun hello() {
    println("Hello")
}

// nothing = a value that never exists
// Nothing has no instances. You can use Nothing to represent
// "a value that never exists": for example, if a function has
// the return type of Nothing, it means that it never returns
// (always throws an exception).
fun throwExceptions() : Nothing {
    throw Exception("This function throws an exception")
}

fun returnsAFour(): Int {
    return 4
}

fun takingString(name: String) {
    println(name)
}

fun sum1(x: Int, y: Int): Int {
    return x + y
}
fun sum2(x: Int, y: Int): Int = x + y
fun sum3(x: Int, y: Int) = x + y
fun sum4(x: Int, y: Int, z: Int = 0) = x + y + z

fun printDetails(name: String, email: String = "", phone: String) {
    println("name: $name, email: $email, phone = $phone")
}

fun printStrings(vararg strings: String) {
    reallyPrintStrings(*strings) // spread operator: *
}

private fun reallyPrintStrings(vararg strings: String) {
    for (string in strings) print("$string ")
}

fun main() {
    hello()
    //throwExceptions()
    val value1 = returnsAFour()
    takingString("Some value")
    println("using sum1 1 + 1 = ${sum1(1, 1)}")
    println("using sum2 2 + 2 = ${sum2(2, 2)}")
    println("using sum3 3 + 3 = ${sum3(3, 3)}")
    println("using sum4 4 + 4 = ${sum4(4, 4)}")
    println("using sum4 4 + 4 + 4 = ${sum4(4, 4, 4)}")

    printDetails("Rick", phone = "262-705-3090")

    printStrings("Rick", "A", "Pendrick", "rpendrick@mail.com", "262-705-3090")
}