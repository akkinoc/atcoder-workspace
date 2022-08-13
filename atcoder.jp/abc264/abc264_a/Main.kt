fun main() {
    val (l, r) = readLine()!!.split(" ").map { it.toInt() }
    print("atcoder".substring(l - 1, r))
}
