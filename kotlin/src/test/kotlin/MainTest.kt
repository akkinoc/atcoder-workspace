import dev.akkinoc.atcoder.workspace.kotlin.test.MainInvoker
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

/**
 * Tests [main].
 */
class MainTest {

    private val invoke: MainInvoker = MainInvoker { main() }

    @Test
    fun `test - main`() {
        invoke("case1").shouldBe("case1")
        invoke("case2").shouldBe("case2")
        invoke("case3").shouldBe("case3")
    }

}
