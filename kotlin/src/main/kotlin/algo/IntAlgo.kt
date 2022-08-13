package algo

object IntAlgo {

    tailrec infix fun Int.gcd(n: Int): Int = if (n == 0) this else n gcd this % n

    infix fun Int.lcm(n: Int): Int = if (this == 0 || n == 0) 0 else this / (this gcd n) * n

}
