object Algorithms {

    tailrec fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }

    tailrec fun gcd(a: Long, b: Long): Long {
        return if (b == 0L) a else gcd(b, a % b)
    }

}
