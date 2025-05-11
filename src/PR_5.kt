fun main() {
    val sum = (1..100)
        .filter { it % 4 == 0 }
        .sum()

    println("Сумма чисел от 1 до 100, кратных 4: $sum")
}