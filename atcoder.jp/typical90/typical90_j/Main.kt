fun main() {
    val n = readLine()!!.toInt()
    val s = Array(2) { IntArray(n + 1) }
    for (i in 1..n) {
        for (c in s.indices) s[c][i] = s[c][i - 1]
        val (c, p) = readLine()!!.split(" ").map { it.toInt() }
        s[c - 1][i] += p
    }
    val q = readLine()!!.toInt()
    repeat(q) {
        val (l, r) = readLine()!!.split(" ").map { it.toInt() }
        val (a, b) = s.map { it[r] - it[l - 1] }
        println("$a $b")
    }
}
