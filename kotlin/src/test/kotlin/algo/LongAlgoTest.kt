package algo

import algo.LongAlgo.gcd
import algo.LongAlgo.lcm
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

/**
 * Tests [LongAlgo].
 */
class LongAlgoTest {

    @Test
    fun gcd() {
        (0L gcd 0L).shouldBe(0L)
        (30L gcd 0L).shouldBe(30L)
        (0L gcd 50L).shouldBe(50L)
        (30L gcd 1L).shouldBe(1L)
        (1L gcd 50L).shouldBe(1L)
        (30L gcd 50L).shouldBe(10L)
        (Long.MAX_VALUE gcd 0L).shouldBe(Long.MAX_VALUE)
        (0L gcd Long.MAX_VALUE).shouldBe(Long.MAX_VALUE)
    }

    @Test
    fun lcm() {
        (0L lcm 0L).shouldBe(0L)
        (30L lcm 0L).shouldBe(0L)
        (0L lcm 50L).shouldBe(0L)
        (30L lcm 1L).shouldBe(30L)
        (1L lcm 50L).shouldBe(50L)
        (30L lcm 50L).shouldBe(150L)
        (Long.MAX_VALUE lcm 1L).shouldBe(Long.MAX_VALUE)
        (1L lcm Long.MAX_VALUE).shouldBe(Long.MAX_VALUE)
    }

}
