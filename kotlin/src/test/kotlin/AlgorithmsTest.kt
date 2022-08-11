import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class AlgorithmsTest {

    @Test
    fun gcd() {
        Algorithms.gcd(0, 0).shouldBe(0)
        Algorithms.gcd(30, 0).shouldBe(30)
        Algorithms.gcd(0, 50).shouldBe(50)
        Algorithms.gcd(30, 1).shouldBe(1)
        Algorithms.gcd(1, 50).shouldBe(1)
        Algorithms.gcd(30, 50).shouldBe(10)
        Algorithms.gcd(Int.MAX_VALUE, 0).shouldBe(Int.MAX_VALUE)
        Algorithms.gcd(0, Int.MAX_VALUE).shouldBe(Int.MAX_VALUE)
        Algorithms.gcd(0L, 0L).shouldBe(0L)
        Algorithms.gcd(30L, 0L).shouldBe(30L)
        Algorithms.gcd(0L, 50L).shouldBe(50L)
        Algorithms.gcd(30L, 1L).shouldBe(1L)
        Algorithms.gcd(1L, 50L).shouldBe(1L)
        Algorithms.gcd(30L, 50L).shouldBe(10L)
        Algorithms.gcd(Long.MAX_VALUE, 0).shouldBe(Long.MAX_VALUE)
        Algorithms.gcd(0, Long.MAX_VALUE).shouldBe(Long.MAX_VALUE)
    }

    @Test
    fun lcm() {
        Algorithms.lcm(0, 0).shouldBe(0)
        Algorithms.lcm(30, 0).shouldBe(0)
        Algorithms.lcm(0, 50).shouldBe(0)
        Algorithms.lcm(30, 1).shouldBe(30)
        Algorithms.lcm(1, 50).shouldBe(50)
        Algorithms.lcm(30, 50).shouldBe(150)
        Algorithms.lcm(Int.MAX_VALUE, 1).shouldBe(Int.MAX_VALUE)
        Algorithms.lcm(1, Int.MAX_VALUE).shouldBe(Int.MAX_VALUE)
        Algorithms.lcm(0, 0).shouldBe(0L)
        Algorithms.lcm(30L, 0L).shouldBe(0L)
        Algorithms.lcm(0L, 50L).shouldBe(0L)
        Algorithms.lcm(30L, 1L).shouldBe(30L)
        Algorithms.lcm(1L, 50L).shouldBe(50L)
        Algorithms.lcm(30L, 50L).shouldBe(150L)
        Algorithms.lcm(Long.MAX_VALUE, 1L).shouldBe(Long.MAX_VALUE)
        Algorithms.lcm(1L, Long.MAX_VALUE).shouldBe(Long.MAX_VALUE)
    }

}
