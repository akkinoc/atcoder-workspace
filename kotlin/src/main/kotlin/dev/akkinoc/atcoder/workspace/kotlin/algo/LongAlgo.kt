package dev.akkinoc.atcoder.workspace.kotlin.algo

/**
 * The algorithms for [Long].
 */
object LongAlgo {

    /**
     * Computes the greatest common divisor.
     *
     * @receiver A number.
     * @param n A number.
     * @return The greatest common divisor.
     */
    tailrec infix fun Long.gcd(n: Long): Long = if (n == 0L) this else n gcd this % n

    /**
     * Computes the least common multiple.
     *
     * @receiver A number.
     * @param n A number.
     * @return The least common multiple.
     */
    infix fun Long.lcm(n: Long): Long = if (this == 0L || n == 0L) 0L else this / (this gcd n) * n

}
