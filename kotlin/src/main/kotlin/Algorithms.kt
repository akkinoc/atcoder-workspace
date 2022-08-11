object Algorithms {

    tailrec fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
    tailrec fun gcd(a: Long, b: Long): Long = if (b == 0L) a else gcd(b, a % b)

    fun lcm(a: Int, b: Int): Int = if (a == 0 || b == 0) 0 else a / gcd(a, b) * b
    fun lcm(a: Long, b: Long): Long = if (a == 0L || b == 0L) 0L else a / gcd(a, b) * b

}
