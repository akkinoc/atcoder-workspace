fun main() {
    val (h, w) = readLine()!!.split(" ").map { it.toInt() }
    val a = List(h) { readLine()!!.split(" ").map { it.toInt() } }
    val r = List(h) { i -> a[i].sum() }
    val c = List(w) { j -> a.map { it[j] }.sum() }
    for (i in 0 until h) println(List(w) { j -> r[i] + c[j] - a[i][j] }.joinToString(" "))
}
