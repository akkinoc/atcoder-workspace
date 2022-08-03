fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    print(if (a * b % 2 == 0) "Even" else "Odd")
}
