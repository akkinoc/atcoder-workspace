package dev.akkinoc.atcoder.workspace.kotlin.algo

import dev.akkinoc.atcoder.workspace.kotlin.algo.LongAlgo.gcd
import dev.akkinoc.atcoder.workspace.kotlin.algo.LongAlgo.lcm
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

/**
 * Tests [LongAlgo].
 */
class LongAlgoTest {

    @Test
    fun `test - gcd`() {
        (30L gcd 50L).shouldBe(10L)
        (30L gcd 1L).shouldBe(1L)
        (1L gcd 50L).shouldBe(1L)
        (30L gcd 0L).shouldBe(30L)
        (0L gcd 50L).shouldBe(50L)
        (0L gcd 0L).shouldBe(0L)
        (Long.MAX_VALUE gcd 0L).shouldBe(Long.MAX_VALUE)
        (0L gcd Long.MAX_VALUE).shouldBe(Long.MAX_VALUE)
    }

    @Test
    fun `test - lcm`() {
        (30L lcm 50L).shouldBe(150L)
        (30L lcm 1L).shouldBe(30L)
        (1L lcm 50L).shouldBe(50L)
        (30L lcm 0L).shouldBe(0L)
        (0L lcm 50L).shouldBe(0L)
        (0L lcm 0L).shouldBe(0L)
        (Long.MAX_VALUE lcm 1L).shouldBe(Long.MAX_VALUE)
        (1L lcm Long.MAX_VALUE).shouldBe(Long.MAX_VALUE)
    }

}
