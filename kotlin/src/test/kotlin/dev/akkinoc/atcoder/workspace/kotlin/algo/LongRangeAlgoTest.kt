package dev.akkinoc.atcoder.workspace.kotlin.algo

import dev.akkinoc.atcoder.workspace.kotlin.algo.LongRangeAlgo.bsearch
import io.kotest.matchers.nulls.shouldBeNull
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

/**
 * Tests [LongRangeAlgo].
 */
class LongRangeAlgoTest {

    @Test
    fun `test - bsearch`() {
        (30L..50L).bsearch { it >= 36L }.shouldBe(36L)
        (30L..50L).bsearch { it >= 0L }.shouldBe(30L)
        (30L..50L).bsearch { it >= 50L }.shouldBe(50L)
        (30L..50L).bsearch { it >= 100L }.shouldBeNull()
        (-50L..-30L).bsearch { it >= -36L }.shouldBe(-36L)
        (-50L..-30L).bsearch { it >= -100L }.shouldBe(-50L)
        (-50L..-30L).bsearch { it >= -30L }.shouldBe(-30L)
        (-50L..-30L).bsearch { it >= 0L }.shouldBeNull()
        (50L..50L).bsearch { it >= 0L }.shouldBe(50L)
        (50L..50L).bsearch { it >= 100L }.shouldBeNull()
        LongRange.EMPTY.bsearch { it >= 0L }.shouldBeNull()
        (Long.MIN_VALUE + 1 until Long.MAX_VALUE).bsearch { it >= Long.MAX_VALUE - 1 }.shouldBe(Long.MAX_VALUE - 1)
        (Long.MIN_VALUE + 1 until Long.MAX_VALUE).bsearch { it >= Long.MIN_VALUE + 1 }.shouldBe(Long.MIN_VALUE + 1)
    }

}
