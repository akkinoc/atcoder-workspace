fun main() {
    val (h, w) = readLine()!!.split(" ").map { it.toInt() }
    print(if (h > 1 && w > 1) ((h + 1) / 2) * ((w + 1) / 2) else h * w)
}