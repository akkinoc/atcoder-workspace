fun main() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toLong() }
    val n = gcd(a, gcd(b, c))
    print((a + b + c) / n - 3)
}

tailrec fun gcd(a: Long, b: Long): Long = if (b == 0L) a else gcd(b, a % b)
