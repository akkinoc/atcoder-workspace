fun main() {
    val (n, l, r) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }
    val sl = LongArray(n + 1)
    for (i in 1..n) sl[i] = minOf(l.toLong() * i, sl[i - 1] + a[i - 1])
    val sr = LongArray(n + 1)
    for (i in n - 1 downTo 0) sr[i] = minOf(r.toLong() * (n - i), a[i] + sr[i + 1])
    print((0..n).map { i -> sl[i] + sr[i] }.min())
}
