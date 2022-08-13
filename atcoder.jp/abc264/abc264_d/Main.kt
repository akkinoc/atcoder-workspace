fun main() {
    var s = readLine()!!
    var r = 0
    fun move(c: Char, i: Int) {
        val p = s.indexOf(c)
        s = s.removeRange(p, p + 1).replaceRange(i, i, "$c")
        r += kotlin.math.abs(p - i)
    }
    move('a', 0)
    move('r', 6)
    move('t', 1)
    move('e', 5)
    move('c', 2)
    move('d', 4)
    move('o', 3)
    print(r)
}
