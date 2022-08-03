fun main() {
    val (n, a, b) = readLine()!!.split(" ").map { it.toInt() }
    val ab = a..b
    var sum = 0
    for (v in 1..n) if (v.sumOfDigits() in ab) sum += v
    print(sum)
}

fun Int.sumOfDigits(): Int {
    var v = this
    var sum = 0
    while (v > 0) {
        sum += v % 10
        v /= 10
    }
    return sum
}
