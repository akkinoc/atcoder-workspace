package dev.akkinoc.atcoder.workspace.kotlin.algo

import dev.akkinoc.atcoder.workspace.kotlin.algo.IntRangeAlgo.bsearch
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

/**
 * Tests [IntRangeAlgo].
 */
class IntRangeAlgoTest {

    @Test
    fun `test - bsearch`() {
        (30..50).bsearch { it >= 36 }.shouldBe(36)
        (30..50).bsearch { it >= 50 }.shouldBe(50)
        (30..50).bsearch { it >= 0 }.shouldBe(30)
        (30..50).bsearch { it >= 100 }.shouldBe(51)
        (50..50).bsearch { it >= 0 }.shouldBe(50)
        (50..50).bsearch { it >= 100 }.shouldBe(51)
        IntRange.EMPTY.bsearch { it >= 0 }.shouldBe(1)
        (Int.MIN_VALUE + 1 until Int.MAX_VALUE).bsearch { it >= Int.MAX_VALUE - 1 }.shouldBe(Int.MAX_VALUE - 1)
        (Int.MIN_VALUE + 1 until Int.MAX_VALUE).bsearch { it >= Int.MIN_VALUE + 1 }.shouldBe(Int.MIN_VALUE + 1)
    }

}
