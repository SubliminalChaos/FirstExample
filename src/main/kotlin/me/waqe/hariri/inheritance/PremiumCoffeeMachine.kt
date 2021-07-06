package me.waqe.hariri.inheritance

class PremiumCoffeeMachine(price: Double, color: String) : BaseCoffeeMachine(price, color) {
    override val brand: String
        get() = "Brand X"

    override fun makeCoffee(type: String): String {
        return "A cup of $type."
    }
}

fun main(args: Array<String>) {
    val coffeeMachine = PremiumCoffeeMachine(1_000.0, "Brown")
    val info = coffeeMachine.machineInfo()
    val coffee = coffeeMachine.makeCoffee("Cappuccino")
    println(coffee)
    println(info)
}