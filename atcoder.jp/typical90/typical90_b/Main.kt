fun main() {
    val n = readLine()!!.toInt()
    if (n % 2 > 0) return
    cases(n / 2).toSortedSet().forEach { println(it) }
}

fun cases(n: Int): Sequence<String> = sequence {
    if (n == 1) return@sequence yield("()")
    for (it in cases(n - 1)) yield("($it)")
    for (c in n - 1 downTo 1) for (l in cases(c)) for (r in cases(n - c)) yield(l + r)
}
