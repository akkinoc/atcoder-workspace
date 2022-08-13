package algo

object LongAlgo {

    tailrec infix fun Long.gcd(n: Long): Long = if (n == 0L) this else n gcd this % n

    infix fun Long.lcm(n: Long): Long = if (this == 0L || n == 0L) 0L else this / (this gcd n) * n

}
