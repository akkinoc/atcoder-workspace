fun main() {
    var (n, m) = readLine()!!.split(" ").map { it.toInt() }
    cases(n, 1, m).forEach { println(it) }
}

fun cases(n: Int, s: Int, e: Int): Sequence<String> = sequence {
    if (n == 1) for (i in s..e) yield("$i")
    else for (i in s..(e - n + 1)) cases(n - 1, i + 1, e).forEach { yield("$i $it") }
}
