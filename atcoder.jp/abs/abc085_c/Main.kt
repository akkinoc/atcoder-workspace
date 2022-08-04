fun main() {
    val (n, y) = readLine()!!.split(" ").map { it.toInt() }
    for (x10000 in n downTo 0) for (x5000 in n - x10000 downTo 0) {
        val x1000 = n - x10000 - x5000
        if (10000 * x10000 + 5000 * x5000 + 1000 * x1000 == y) return print("$x10000 $x5000 $x1000")
    }
    print("-1 -1 -1")
}