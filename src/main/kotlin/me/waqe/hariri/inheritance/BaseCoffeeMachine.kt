package me.waqe.hariri.inheritance

abstract class BaseCoffeeMachine(
    private val price: Double,
    private val color: String
) {
    abstract val brand: String

    abstract fun makeCoffee(type: String) : String

    fun machineInfo() : String {
        return """Coffee Machine Details:
            |  Price: $$price
            |  Color: $color
        """.trimMargin()
     }
}