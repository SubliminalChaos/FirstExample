package me.waqe.hariri.classes

enum class Priority(val value: Int) {
    MINOR(-1) {
        override fun toString(): String {
            return "Slow and steady.."
        }
              },
    NORMAL(0),
    MAJOR(1),
    CRITICAL(10),
}

fun main() {
    val prior = Priority.NORMAL
    println(prior)
    println(prior.value)
    println(prior.ordinal)        // index
    println(Priority.CRITICAL.name)

    for (priority in Priority.values()) {
        println("p = $priority")
    }

    val p = Priority.valueOf("MINOR")
    println(p.ordinal)
    println(p)
 }
