fun main() {
    readLine()
    val a = readLine()!!.split(" ")
    val c = a.map { Integer.numberOfTrailingZeros(it.toInt()) }
    print(c.min())
}
