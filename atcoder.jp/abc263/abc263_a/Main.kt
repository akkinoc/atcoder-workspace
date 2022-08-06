fun main() {
    val c = readLine()!!.split(" ").map { it.toInt() }
    val m = c.groupingBy { it }.eachCount()
    print(if (m.size == 2 && m.values.contains(2) && m.values.contains(3)) "Yes" else "No")
}
