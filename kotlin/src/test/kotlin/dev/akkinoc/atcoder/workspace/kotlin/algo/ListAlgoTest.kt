package dev.akkinoc.atcoder.workspace.kotlin.algo

import dev.akkinoc.atcoder.workspace.kotlin.algo.ListAlgo.comb
import dev.akkinoc.atcoder.workspace.kotlin.algo.ListAlgo.perm
import dev.akkinoc.atcoder.workspace.kotlin.algo.ListAlgo.rcomb
import dev.akkinoc.atcoder.workspace.kotlin.algo.ListAlgo.rperm
import io.kotest.matchers.sequences.shouldContainExactly
import io.kotest.matchers.sequences.shouldHaveSize
import org.junit.jupiter.api.Test

/**
 * Tests [ListAlgo].
 */
class ListAlgoTest {

    @Test
    fun `test - perm`() {
        listOf('A', 'B', 'C').perm(3).shouldContainExactly(
            listOf('A', 'B', 'C'), listOf('A', 'C', 'B'),
            listOf('B', 'A', 'C'), listOf('B', 'C', 'A'),
            listOf('C', 'A', 'B'), listOf('C', 'B', 'A')
        )
        listOf('A', 'B', 'C').perm(2).shouldContainExactly(
            listOf('A', 'B'), listOf('A', 'C'),
            listOf('B', 'A'), listOf('B', 'C'),
            listOf('C', 'A'), listOf('C', 'B')
        )
        listOf('A', 'B', 'C').perm(1).shouldContainExactly(listOf('A'), listOf('B'), listOf('C'))
        listOf('A', 'B', 'C').perm(0).shouldContainExactly(emptyList())
        emptyList<Any>().perm(0).shouldContainExactly(emptyList())
        List(100) { it }.perm(4).shouldHaveSize(94_109_400)
    }

    @Test
    fun `test - rperm`() {
        listOf('A', 'B', 'C').rperm(3).shouldContainExactly(
            listOf('A', 'A', 'A'), listOf('A', 'A', 'B'), listOf('A', 'A', 'C'),
            listOf('A', 'B', 'A'), listOf('A', 'B', 'B'), listOf('A', 'B', 'C'),
            listOf('A', 'C', 'A'), listOf('A', 'C', 'B'), listOf('A', 'C', 'C'),
            listOf('B', 'A', 'A'), listOf('B', 'A', 'B'), listOf('B', 'A', 'C'),
            listOf('B', 'B', 'A'), listOf('B', 'B', 'B'), listOf('B', 'B', 'C'),
            listOf('B', 'C', 'A'), listOf('B', 'C', 'B'), listOf('B', 'C', 'C'),
            listOf('C', 'A', 'A'), listOf('C', 'A', 'B'), listOf('C', 'A', 'C'),
            listOf('C', 'B', 'A'), listOf('C', 'B', 'B'), listOf('C', 'B', 'C'),
            listOf('C', 'C', 'A'), listOf('C', 'C', 'B'), listOf('C', 'C', 'C')
        )
        listOf('A', 'B', 'C').rperm(2).shouldContainExactly(
            listOf('A', 'A'), listOf('A', 'B'), listOf('A', 'C'),
            listOf('B', 'A'), listOf('B', 'B'), listOf('B', 'C'),
            listOf('C', 'A'), listOf('C', 'B'), listOf('C', 'C')
        )
        listOf('A', 'B', 'C').rperm(1).shouldContainExactly(listOf('A'), listOf('B'), listOf('C'))
        listOf('A', 'B', 'C').rperm(0).shouldContainExactly(emptyList())
        emptyList<Any>().rperm(0).shouldContainExactly(emptyList())
        List(100) { it }.rperm(4).shouldHaveSize(100_000_000)
    }

    @Test
    fun `test - comb`() {
        listOf('A', 'B', 'C').comb(3).shouldContainExactly(listOf('A', 'B', 'C'))
        listOf('A', 'B', 'C').comb(2).shouldContainExactly(listOf('A', 'B'), listOf('A', 'C'), listOf('B', 'C'))
        listOf('A', 'B', 'C').comb(1).shouldContainExactly(listOf('A'), listOf('B'), listOf('C'))
        listOf('A', 'B', 'C').comb(0).shouldContainExactly(emptyList())
        emptyList<Any>().comb(0).shouldContainExactly(emptyList())
        List(100) { it }.comb(5).shouldHaveSize(75_287_520)
    }

    @Test
    fun `test - rcomb`() {
        listOf('A', 'B', 'C').rcomb(3).shouldContainExactly(
            listOf('A', 'A', 'A'), listOf('A', 'A', 'B'), listOf('A', 'A', 'C'),
            listOf('A', 'B', 'B'), listOf('A', 'B', 'C'), listOf('A', 'C', 'C'),
            listOf('B', 'B', 'B'), listOf('B', 'B', 'C'), listOf('B', 'C', 'C'),
            listOf('C', 'C', 'C')
        )
        listOf('A', 'B', 'C').rcomb(2).shouldContainExactly(
            listOf('A', 'A'), listOf('A', 'B'), listOf('A', 'C'),
            listOf('B', 'B'), listOf('B', 'C'), listOf('C', 'C')
        )
        listOf('A', 'B', 'C').rcomb(1).shouldContainExactly(listOf('A'), listOf('B'), listOf('C'))
        listOf('A', 'B', 'C').rcomb(0).shouldContainExactly(emptyList())
        emptyList<Any>().rcomb(0).shouldContainExactly(emptyList())
        List(100) { it }.rcomb(5).shouldHaveSize(91_962_520)
    }

}
