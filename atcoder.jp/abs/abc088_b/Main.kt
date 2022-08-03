fun main() {
    readLine()
    val a = readLine()!!.split(" ").mapTo(mutableListOf()) { it.toInt() }
    a.sortDescending()
    val r = a.reduceIndexed { index, sum, it -> sum + if (index % 2 == 0) it else -it }
    print(r)
}
