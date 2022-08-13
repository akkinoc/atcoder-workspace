fun main() {
    val n = readLine()!!.toInt()
    val s = List(n) { readLine()!! }
    val d = mutableSetOf<String>()
    s.forEachIndexed { i, e -> if (e !in d) println(i + 1); d += e }
}
