fun main() {
    print("Введите число: ")
    val number = readLine()?.toIntOrNull()

    if (number == null || number <= 0) {
        println("Некорректный ввод")
        return
    }

    print("Делители числа $number: ")
    for (i in 1..number) {
        if (number % i == 0) {
            print("$i ")
        }
    }
}
