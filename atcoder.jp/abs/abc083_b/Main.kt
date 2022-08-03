fun main() {
    val (n, a, b) = readLine()!!.split(" ").map { it.toInt() }
    val ab = a..b
    val r = (1..n).sumBy { if (it.sumOfDigits() in ab) it else 0 }
    print(r)
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
