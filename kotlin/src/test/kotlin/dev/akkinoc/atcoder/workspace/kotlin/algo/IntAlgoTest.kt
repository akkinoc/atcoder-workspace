package dev.akkinoc.atcoder.workspace.kotlin.algo

import dev.akkinoc.atcoder.workspace.kotlin.algo.IntAlgo.gcd
import dev.akkinoc.atcoder.workspace.kotlin.algo.IntAlgo.lcm
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

/**
 * Tests [IntAlgo].
 */
class IntAlgoTest {

    @Test
    fun `test - gcd`() {
        (30 gcd 50).shouldBe(10)
        (30 gcd 1).shouldBe(1)
        (1 gcd 50).shouldBe(1)
        (30 gcd 0).shouldBe(30)
        (0 gcd 50).shouldBe(50)
        (0 gcd 0).shouldBe(0)
        (Int.MAX_VALUE gcd 0).shouldBe(Int.MAX_VALUE)
        (0 gcd Int.MAX_VALUE).shouldBe(Int.MAX_VALUE)
    }

    @Test
    fun `test - lcm`() {
        (30 lcm 50).shouldBe(150)
        (30 lcm 1).shouldBe(30)
        (1 lcm 50).shouldBe(50)
        (30 lcm 0).shouldBe(0)
        (0 lcm 50).shouldBe(0)
        (0 lcm 0).shouldBe(0)
        (Int.MAX_VALUE lcm 1).shouldBe(Int.MAX_VALUE)
        (1 lcm Int.MAX_VALUE).shouldBe(Int.MAX_VALUE)
    }

}
