package dev.akkinoc.atcoder.workspace.kotlin.algo

/**
 * The algorithms for [LongRange].
 */
object LongRangeAlgo {

    /**
     * Finds an element by binary search algorithm.
     *
     * @receiver A number range.
     * @param fn The function that determines whether an element is selected.
     * @return The first element selected, or `null` if not found.
     */
    fun LongRange.bsearch(fn: (e: Long) -> Boolean): Long? {
        var l = first - 1L
        var r = last + 1L
        while (l < r - 1) (l + (r - l ushr 1)).also { if (fn(it)) r = it else l = it }
        return r.takeIf { it <= last }
    }

}
