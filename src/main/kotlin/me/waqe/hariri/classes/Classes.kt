package me.waqe.hariri.classes

import java.lang.IllegalArgumentException
import java.util.*

// declare and initialize properties on single line in constructor by using var
class Customer1(var id: Int, var name: String) {
}

// id is now NOT property, just a value being passed in to constructor
class Customer2(id: Int, var name: String) {
}

class Customer3(val id: Int, var name: String) {
    init {
        name = name.uppercase()
    }
}

// Using non-default getters and setters
class Customer4(val id: Int, var name: String, val birthYear: Int) {
    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - birthYear

    var socialSecurityNumber: String = ""
        set(valueOrAnyName) {
            if (!valueOrAnyName.startsWith("SN")) {
                throw IllegalArgumentException("SSN number must start with SN")
            }
            field = valueOrAnyName
        }
}

fun main() {
    val customer1 = Customer1(1, "Tracy")
    customer1.id = 10
    customer1.name = "Rick"

    val customer2 = Customer2(12, "Rick")
    //customer2.id = 10
    customer2.name = "Ron"

    val customer3 = Customer3(10,"Mike")
    println("name = ${customer3.name}")

    val customer4 = Customer4(11, "Ron", 1937)
    println("${customer4.name} is ${customer4.age} years old.")
}
