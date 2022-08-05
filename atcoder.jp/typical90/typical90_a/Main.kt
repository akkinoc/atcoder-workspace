fun main() {
    val (_, l) = readLine()!!.split(" ").map { it.toInt() }
    val k = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    val s = (1 until l).search { s ->
        var c = 0
        var e = 0
        for (it in a) if (it - e >= s && l - it >= s) {
            c++
            e = it
        }
        c >= k
    }
    print(s)
}

fun IntRange.search(b: (Int) -> Boolean): Int {
    var l = this.first - 1
    var r = this.last + 1
    while (r - l > 1) {
        val m = l + (r - l) / 2
        if (b(m)) l = m else r = m
    }
    return l
}
