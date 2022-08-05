fun main() {
    val (_, l) = readLine()!!.split(" ").map { it.toInt() }
    val k = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    val s = (1 until l).search { s ->
        val c = mutableListOf<Int>()
        a.forEach {
            val e = c.lastOrNull() ?: 0
            if (it - e >= s && l - it >= s) c += it
        }
        c.size >= k
    }
    print(s)
}

fun IntRange.search(b: (Int) -> Boolean): Int {
    var f = this.first - 1
    var l = this.last + 1
    while (l - f > 1) {
        val m = f + (l - f) / 2
        if (b(m)) f = m else l = m
    }
    return f
}
