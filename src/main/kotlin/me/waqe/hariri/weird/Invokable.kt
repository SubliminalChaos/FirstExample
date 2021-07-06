/**

Invoke

Objects with an invoke() method can be invoked as a function.

You can add an invoke extension for any class, but it's better not to overuse it:

fun Int.invoke() { println(this) }

1() //huh?..
Implement the function Invokable.invoke() so it can count the number of times it is
invoked.

 */


package me.waqe.hariri.weird

class Invokable {
    var numberOfInvocations: Int = 0
        private set  // the setter is private and has the default implementation
    // By default all properties and functions are public in Kotlin.
    // Hence the setter has to be explicitly declared private while
    // the getter is public by default.

    operator fun invoke(): Invokable {
        numberOfInvocations++
        return this
    }
}

fun invokeTwice(invokable: Invokable) = invokable()()

fun main() {
    val invokableFunction = Invokable()
    invokeTwice(invokableFunction)
    println("invokableFunction.numberOfInvocations = " + invokableFunction.numberOfInvocations)
}