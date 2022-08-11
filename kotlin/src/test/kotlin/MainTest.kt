import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class MainTest {

    private val invoke: MainInvoker = MainInvoker()

    @Test
    fun test() {
        invoke("test").shouldBe("test")
    }

}
