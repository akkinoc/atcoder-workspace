fun main() {
    val (h1, w1) = readLine()!!.split(" ").map { it.toInt() }
    val a = List(h1) { readLine()!!.split(" ") }
    val (h2, w2) = readLine()!!.split(" ").map { it.toInt() }
    val b = List(h2) { readLine()!!.split(" ") }
    for (r in (0 until h1).combinations(h1 - h2)) {
        val w = a.filterIndexed { i, _ -> i !in r }
        for (c in (0 until w1).combinations(w1 - w2))
            if (w.map { it.filterIndexed { i, _ -> i !in c } } == b) return print("Yes")
    }
    print("No")
}

fun <T> Iterable<T>.combinations(r: Int): Sequence<List<T>> = sequence {
    if (r < 1) yield(emptyList())
    else forEachIndexed { i, e -> drop(i + 1).combinations(r - 1).forEach { yield(listOf(e) + it) } }
}
