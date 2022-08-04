fun main() {
    val n = readLine()!!.toInt()
    val d = (1..n).map { readLine()!!.toInt() }
    print(d.toSet().size)
}