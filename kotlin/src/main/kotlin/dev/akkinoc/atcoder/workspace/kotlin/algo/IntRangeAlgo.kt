package dev.akkinoc.atcoder.workspace.kotlin.algo

/**
 * The algorithms for [IntRange].
 */
object IntRangeAlgo {

    /**
     * Finds an element by binary search algorithm.
     *
     * @receiver A number range.
     * @param fn The function that determines whether an element is selected.
     * @return The first element selected, or the last value + 1 if not found.
     */
    fun IntRange.bsearch(fn: (n: Int) -> Boolean): Int {
        var l = this.first - 1
        var r = this.last + 1
        while (l < r - 1) (l + (r - l ushr 1)).also { if (fn(it)) r = it else l = it }
        return r
    }

}
