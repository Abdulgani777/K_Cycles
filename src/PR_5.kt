fun main() {
    println("Введите три числа:")
    val a = readlnOrNull()?.toIntOrNull()
    val b = readlnOrNull()?.toIntOrNull()
    val c = readlnOrNull()?.toIntOrNull()

    if (a == null || b == null || c == null) {
        println("Ошибка ввода")
        return
    }

    if (a == b && b == c) {
        println("Ошибка")
    } else {
        val middle = listOf(a, b, c).sorted()[1]
        println("Среднее число: $middle")
    }
}
