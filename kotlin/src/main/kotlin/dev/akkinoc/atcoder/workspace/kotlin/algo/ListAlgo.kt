package dev.akkinoc.atcoder.workspace.kotlin.algo

/**
 * The algorithms for [List].
 */
object ListAlgo {

    /**
     * Generate a sequence of permutations.
     *
     * @receiver The source elements.
     * @param T The element type.
     * @param r The number of elements to select.
     * @return A sequence of permutations.
     */
    fun <T> List<T>.perm(r: Int = size): Sequence<List<T>> = sequence {
        if (r < 1) yield(emptyList())
        else forEachIndexed { i, e -> (take(i) + drop(i + 1)).perm(r - 1).forEach { yield(listOf(e) + it) } }
    }

    /**
     * Generate a sequence of repeated permutations.
     *
     * @receiver The source elements.
     * @param T The element type.
     * @param r The number of elements to select.
     * @return A sequence of repeated permutations.
     */
    fun <T> List<T>.rperm(r: Int = size): Sequence<List<T>> = sequence {
        if (r < 1) yield(emptyList())
        else forEach { e -> rperm(r - 1).forEach { yield(listOf(e) + it) } }
    }

    /**
     * Generate a sequence of combinations.
     *
     * @receiver The source elements.
     * @param T The element type.
     * @param r The number of elements to select.
     * @return A sequence of combinations.
     */
    fun <T> List<T>.comb(r: Int = size): Sequence<List<T>> = sequence {
        if (r < 1) yield(emptyList())
        else forEachIndexed { i, e -> drop(i + 1).comb(r - 1).forEach { yield(listOf(e) + it) } }
    }

    /**
     * Generate a sequence of repeated combinations.
     *
     * @receiver The source elements.
     * @param T The element type.
     * @param r The number of elements to select.
     * @return A sequence of repeated combinations.
     */
    fun <T> List<T>.rcomb(r: Int = size): Sequence<List<T>> = sequence {
        if (r < 1) yield(emptyList())
        else forEachIndexed { i, e -> drop(i).rcomb(r - 1).forEach { yield(listOf(e) + it) } }
    }

}
