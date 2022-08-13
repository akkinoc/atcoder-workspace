package algo

/**
 * The algorithms for [Int].
 */
object IntAlgo {

    /**
     * Computes the greatest common divisor.
     *
     * @receiver A number.
     * @param n A number.
     * @return The greatest common divisor.
     */
    tailrec infix fun Int.gcd(n: Int): Int = if (n == 0) this else n gcd this % n

    /**
     * Computes the least common multiple.
     *
     * @receiver A number.
     * @param n A number.
     * @return The least common multiple.
     */
    infix fun Int.lcm(n: Int): Int = if (this == 0 || n == 0) 0 else this / (this gcd n) * n

}
