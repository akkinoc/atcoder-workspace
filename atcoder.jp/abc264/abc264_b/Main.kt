fun main() {
    val (r, c) = readLine()!!.split(" ").map { it.toInt() }
    val w = r % 2 == 0 && (c in minOf(r, 16 - r)..maxOf(r, 16 - r)) ||
            c % 2 == 0 && (r in minOf(c, 16 - c)..maxOf(c, 16 - c))
    print(if (w) "white" else "black")
}
