package me.waqe.hariri.weird

// task.kt
import me.waqe.hariri.weird.TimeInterval.*
import java.util.Calendar

fun main() {
    val today = MyDate(2021, 7, 5)
    val result1 = task1(today)
    println("result1.year = ${result1.year}")
    println("result1.month = ${result1.month}")
    println("result1.dayOfMonth = ${result1.dayOfMonth}")
    val result2 = task2(today)
    println("result2.year = ${result2.year}")
    println("result2.month = ${result2.month}")
    println("result2.dayOfMonth = ${result2.dayOfMonth}")

}

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

// Supported intervals that might be added to dates:
enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval) =
    addTimeIntervals(timeInterval, 1)

class RepeatedTimeInterval(val timeInterval: TimeInterval, val number: Int)

operator fun TimeInterval.times(number: Int) =
    RepeatedTimeInterval(this, number)

operator fun MyDate.plus(timeIntervals: RepeatedTimeInterval) =
    addTimeIntervals(timeIntervals.timeInterval, timeIntervals.number)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}

// dateutil.kt

/*
 * Returns the date after the given time interval.
 * The interval is specified as the given amount of days, weeks of years.
 * Usages:
 * 'date.addTimeIntervals(TimeInterval.DAY, 4)'
 * 'date.addTimeIntervals(TimeInterval.WEEK, 3)'
 */
fun MyDate.addTimeIntervals(timeInterval: TimeInterval, amount: Int): MyDate {
    val c = Calendar.getInstance()
    c.set(year + if (timeInterval == TimeInterval.YEAR) amount else 0, month, dayOfMonth)
    var timeInMillis = c.timeInMillis
    val millisecondsInADay = 24 * 60 * 60 * 1000L
    timeInMillis += amount * when (timeInterval) {
        TimeInterval.DAY -> millisecondsInADay
        TimeInterval.WEEK -> 7 * millisecondsInADay
        TimeInterval.YEAR -> 0L
    }
    val result = Calendar.getInstance()
    result.timeInMillis = timeInMillis
    return MyDate(result.get(Calendar.YEAR), result.get(Calendar.MONTH), result.get(Calendar.DATE))
}