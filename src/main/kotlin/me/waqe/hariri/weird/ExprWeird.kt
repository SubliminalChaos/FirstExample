package me.waqe.hariri.weird

fun eval(expr: Expr): Int =
    when (expr) {
        is Num -> expr.value
        is Sum -> eval(expr.left) + eval(expr.right)
        else -> throw IllegalArgumentException("Unknown expression")
    }

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun main() {
    val num = Num(2)
    val sum = Sum(Num(2), Num(3))
    var result = eval(num)
    println(result)
    result = eval(sum)
    println(result)
}