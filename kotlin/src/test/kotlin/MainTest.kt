import dev.akkinoc.atcoder.workspace.kotlin.test.MainInvoker
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

/**
 * Tests [main].
 */
class MainTest {

    private val invoke: MainInvoker = MainInvoker { main() }

    @Test
    fun test() {
        invoke("test").shouldBe("test")
    }

}
