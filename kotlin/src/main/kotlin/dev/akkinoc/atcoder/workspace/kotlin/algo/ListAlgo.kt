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
    fun <T> List<T>.permutations(r: Int = size): Sequence<List<T>> = sequence {
        if (r < 1) yield(emptyList())
        else forEachIndexed { i, e -> (take(i) + drop(i + 1)).permutations(r - 1).forEach { yield(listOf(e) + it) } }
    }

    /**
     * Generate a sequence of repeated permutations.
     *
     * @receiver The source elements.
     * @param T The element type.
     * @param r The number of elements to select.
     * @return A sequence of repeated permutations.
     */
    fun <T> List<T>.repeatedPermutations(r: Int = size): Sequence<List<T>> = sequence {
        if (r < 1) yield(emptyList())
        else forEach { e -> repeatedPermutations(r - 1).forEach { yield(listOf(e) + it) } }
    }

    /**
     * Generate a sequence of combinations.
     *
     * @receiver The source elements.
     * @param T The element type.
     * @param r The number of elements to select.
     * @return A sequence of combinations.
     */
    fun <T> List<T>.combinations(r: Int = size): Sequence<List<T>> = sequence {
        if (r < 1) yield(emptyList())
        else forEachIndexed { i, e -> drop(i + 1).combinations(r - 1).forEach { yield(listOf(e) + it) } }
    }

    /**
     * Generate a sequence of repeated combinations.
     *
     * @receiver The source elements.
     * @param T The element type.
     * @param r The number of elements to select.
     * @return A sequence of repeated combinations.
     */
    fun <T> List<T>.repeatedCombinations(r: Int = size): Sequence<List<T>> = sequence {
        if (r < 1) yield(emptyList())
        else forEachIndexed { i, e -> drop(i).repeatedCombinations(r - 1).forEach { yield(listOf(e) + it) } }
    }

}
