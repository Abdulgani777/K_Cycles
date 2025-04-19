fun main() {
    var i = 5
    var sum = 0

    while (i <= 57) {
        if (i != 34 && i != 46 && i != 52) {
            sum += i
        }
        i++
    }

    println("Сумма чисел от 5 до 57 (без 34, 46, 52): $sum")
}
