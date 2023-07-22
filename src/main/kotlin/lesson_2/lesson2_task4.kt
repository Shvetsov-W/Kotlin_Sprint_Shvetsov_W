package lesson_2

fun main() {
    val crystals: Int = 7
    val ferrum: Int = 11
    println("Бонус кристаллической руды: ${calculateBonus(20, crystals)}")
    println("Бонус железной руды: ${calculateBonus(20, ferrum)}")

}

fun calculateBonus(percent: Int, material: Int): Int {
    return (material.toDouble() / 100 * percent).toInt()
}