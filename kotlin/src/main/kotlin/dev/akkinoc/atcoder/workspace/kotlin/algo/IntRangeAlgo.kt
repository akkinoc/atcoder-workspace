package dev.akkinoc.atcoder.workspace.kotlin.algo

/**
 * The algorithms for [IntRange].
 */
object IntRangeAlgo {

    /**
     * Finds an element by binary search algorithm.
     *
     * @receiver A number range.
     * @param f The function that determines whether an element is selected.
     * @return The first element selected, or `null` if not found.
     */
    fun IntRange.bsearch(f: (e: Int) -> Boolean): Int? {
        var l = first - 1
        var r = last + 1
        while (l < r - 1) (l + (r - l ushr 1)).also { if (f(it)) r = it else l = it }
        return r.takeIf { it <= last }
    }

}
