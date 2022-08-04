import kotlin.math.abs

fun main() {
    val n = readLine()!!.toInt()
    val r = (1..n).mapTo(mutableListOf()) { Rec(readLine()!!.split(" ").map { it.toInt() }) }
    var c = Rec()
    r.forEach { if (c.reach(it)) c = it else return print("No") }
    print("Yes")
}

data class Rec(val t: Int = 0, val x: Int = 0, val y: Int = 0) {
    constructor(a: List<Int>) : this(a[0], a[1], a[2])
    fun reach(r: Rec): Boolean {
        val t = r.t - t
        val d = abs(r.x - x) + abs(r.y - y)
        return d <= t && (t - d) % 2 == 0
    }
}