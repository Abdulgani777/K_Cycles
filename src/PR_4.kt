fun main() {
    print("Введите число: ")
    val input = readLine()

    if (input == null || input.any { !it.isDigit() }) {
        println("Некорректный ввод")
        return
    }

    var evenCount = 0
    var oddCount = 0

    for (char in input) {
        val digit = char.digitToInt()
        if (digit % 2 == 0) evenCount++ else oddCount++
    }

    println("Четных цифр: $evenCount")
    println("Нечетных цифр: $oddCount")
}
