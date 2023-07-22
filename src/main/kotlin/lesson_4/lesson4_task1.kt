package lesson_4

fun main() {
    val numberOfTables: Int = 13
    var reservedToday: Int = 13
    var reservedTomorrow: Int = 9

    checkReserve(reservedToday, reservedTomorrow, numberOfTables)
}

fun checkReserve(reservedToday: Int, reservedTomorrow: Int, numberOfTables: Int) {
    println("[Доступность столиков на сегодня:${reservedToday < numberOfTables}]")
    println("[Доступность столиков на завтра:${reservedTomorrow < numberOfTables}]")
}