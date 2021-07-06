package me.waqe.hariri.inheritance

// by default all class types and members are final,
// must be declared as open to inherit from
open class Person: Any() {
    open fun validate() {}
}

class Customer() : Person() {
    override fun validate() {}

}