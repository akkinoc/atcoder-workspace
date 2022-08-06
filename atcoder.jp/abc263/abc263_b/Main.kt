fun main() {
    var n = readLine()!!.toInt()
    val p = readLine()!!.split(" ").map { it.toInt() }
    var c = 1
    while (p[n - 2] != 1) {
        c++
        n = p[n - 2]
    }
    print(c)
}
