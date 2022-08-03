fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val x = readLine()!!.toInt()
    var p = 0
    for (x500 in 0..a) for (x100 in 0..b) for (x50 in 0..c)
        if (500 * x500 + 100 * x100 + 50 * x50 == x) p++
    print(p)
}
