package dev.akkinoc.atcoder.workspace.kotlin.algo

import dev.akkinoc.atcoder.workspace.kotlin.algo.ListAlgo.combinations
import dev.akkinoc.atcoder.workspace.kotlin.algo.ListAlgo.permutations
import dev.akkinoc.atcoder.workspace.kotlin.algo.ListAlgo.repeatedCombinations
import dev.akkinoc.atcoder.workspace.kotlin.algo.ListAlgo.repeatedPermutations
import io.kotest.matchers.sequences.shouldContainExactly
import org.junit.jupiter.api.Test

/**
 * Tests [ListAlgo].
 */
class ListAlgoTest {

    @Test
    fun `test - permutations`() {
        listOf('A', 'B', 'C').permutations().shouldContainExactly(
            listOf('A', 'B', 'C'), listOf('A', 'C', 'B'),
            listOf('B', 'A', 'C'), listOf('B', 'C', 'A'),
            listOf('C', 'A', 'B'), listOf('C', 'B', 'A')
        )
        listOf('A', 'B', 'C').permutations(2).shouldContainExactly(
            listOf('A', 'B'), listOf('A', 'C'),
            listOf('B', 'A'), listOf('B', 'C'),
            listOf('C', 'A'), listOf('C', 'B')
        )
        listOf('A', 'B', 'C').permutations(1).shouldContainExactly(listOf('A'), listOf('B'), listOf('C'))
        listOf('A', 'B', 'C').permutations(0).shouldContainExactly(emptyList())
        emptyList<Any>().permutations().shouldContainExactly(emptyList())
    }

    @Test
    fun `test - repeatedPermutations`() {
        listOf('A', 'B', 'C').repeatedPermutations().shouldContainExactly(
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
        listOf('A', 'B', 'C').repeatedPermutations(2).shouldContainExactly(
            listOf('A', 'A'), listOf('A', 'B'), listOf('A', 'C'),
            listOf('B', 'A'), listOf('B', 'B'), listOf('B', 'C'),
            listOf('C', 'A'), listOf('C', 'B'), listOf('C', 'C')
        )
        listOf('A', 'B', 'C').repeatedPermutations(1).shouldContainExactly(listOf('A'), listOf('B'), listOf('C'))
        listOf('A', 'B', 'C').repeatedPermutations(0).shouldContainExactly(emptyList())
        emptyList<Any>().repeatedPermutations().shouldContainExactly(emptyList())
    }

    @Test
    fun `test - combinations`() {
        listOf('A', 'B', 'C').combinations().shouldContainExactly(listOf('A', 'B', 'C'))
        listOf('A', 'B', 'C').combinations(2).shouldContainExactly(listOf('A', 'B'), listOf('A', 'C'), listOf('B', 'C'))
        listOf('A', 'B', 'C').combinations(1).shouldContainExactly(listOf('A'), listOf('B'), listOf('C'))
        listOf('A', 'B', 'C').combinations(0).shouldContainExactly(emptyList())
        emptyList<Any>().combinations().shouldContainExactly(emptyList())
    }

    @Test
    fun `test - repeatedCombinations`() {
        listOf('A', 'B', 'C').repeatedCombinations().shouldContainExactly(
            listOf('A', 'A', 'A'), listOf('A', 'A', 'B'), listOf('A', 'A', 'C'),
            listOf('A', 'B', 'B'), listOf('A', 'B', 'C'), listOf('A', 'C', 'C'),
            listOf('B', 'B', 'B'), listOf('B', 'B', 'C'), listOf('B', 'C', 'C'),
            listOf('C', 'C', 'C')
        )
        listOf('A', 'B', 'C').repeatedCombinations(2).shouldContainExactly(
            listOf('A', 'A'), listOf('A', 'B'), listOf('A', 'C'),
            listOf('B', 'B'), listOf('B', 'C'), listOf('C', 'C')
        )
        listOf('A', 'B', 'C').repeatedCombinations(1).shouldContainExactly(listOf('A'), listOf('B'), listOf('C'))
        listOf('A', 'B', 'C').repeatedCombinations(0).shouldContainExactly(emptyList())
        emptyList<Any>().repeatedCombinations().shouldContainExactly(emptyList())
    }

}
