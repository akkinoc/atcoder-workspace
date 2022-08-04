fun main() {
    var s = readLine()!!
    listOf("eraser", "erase", "dreamer", "dream").forEach { s = s.replace(it, "") }
    print(if (s == "") "YES" else "NO")
}