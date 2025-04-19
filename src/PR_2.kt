fun main() {
    val secret = (1..9).random()
    var guess: Int?

    do {
        println("Угадайте число от 1 до 9:")
        guess = readLine()?.toIntOrNull()
    } while (guess != secret)

    println("Правильно! Загаданное число: $secret")
}
