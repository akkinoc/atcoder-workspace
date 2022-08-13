fun main() {
    val (_, k) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }
    val b = readLine()!!.split(" ").map { it.toInt() }
    val c = a.zip(b).sumBy { (a, b) -> kotlin.math.abs(a - b) }
    print(if (c <= k && (k - c) % 2 == 0) "Yes" else "No")
}
