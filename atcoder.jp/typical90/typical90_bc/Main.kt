fun main() {
    val (n, p, q) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toLong() }
    var c = 0
    for (i in 0 until n) for (j in 0 until i) for (k in 0 until j) for (l in 0 until k) for (m in 0 until l)
        if (a[i] % p * a[j] % p * a[k] % p * a[l] % p * a[m] % p == q.toLong()) c++
    print(c)
}