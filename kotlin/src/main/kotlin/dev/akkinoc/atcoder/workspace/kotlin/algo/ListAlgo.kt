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
    fun <T> List<T>.perm(r: Int): Sequence<List<T>> {
        val i = IntArray(size) { it }
        val c = IntArray(r) { size - it }
        return generateSequence(List(r) { get(i[it]) }) s@{ _ ->
            val p = (r - 1 downTo 0).find f@{ p ->
                if (--c[p] > 0) return@f true
                i[size - 1] = i[p].also { i.copyInto(i, p, p + 1) }
                c[p] = size - p
                false
            } ?: return@s null
            i[size - c[p]] = i[p].also { i[p] = i[size - c[p]] }
            List(r) { get(i[it]) }
        }
    }

    /**
     * Generate a sequence of repeated permutations.
     *
     * @receiver The source elements.
     * @param T The element type.
     * @param r The number of elements to select.
     * @return A sequence of repeated permutations.
     */
    fun <T> List<T>.rperm(r: Int): Sequence<List<T>> {
        val i = IntArray(r)
        return generateSequence(i.map(::get)) s@{ _ ->
            val p = (r - 1 downTo 0).find { i[it] < size - 1 } ?: return@s null
            ++i[p]
            i.fill(0, p + 1)
            i.map(::get)
        }
    }

    /**
     * Generate a sequence of combinations.
     *
     * @receiver The source elements.
     * @param T The element type.
     * @param r The number of elements to select.
     * @return A sequence of combinations.
     */
    fun <T> List<T>.comb(r: Int): Sequence<List<T>> {
        val i = IntArray(r) { it }
        return generateSequence(i.map(::get)) s@{ _ ->
            var p = (r - 1 downTo 0).find { i[it] < size - r + it } ?: return@s null
            var n = i[p]
            while (p < r) i[p++] = ++n
            i.map(::get)
        }
    }

    /**
     * Generate a sequence of repeated combinations.
     *
     * @receiver The source elements.
     * @param T The element type.
     * @param r The number of elements to select.
     * @return A sequence of repeated combinations.
     */
    fun <T> List<T>.rcomb(r: Int): Sequence<List<T>> {
        val i = IntArray(r)
        return generateSequence(i.map(::get)) s@{ _ ->
            val p = (r - 1 downTo 0).find { i[it] < size - 1 } ?: return@s null
            i.fill(i[p] + 1, p)
            i.map(::get)
        }
    }

}
