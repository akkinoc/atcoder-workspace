import io.kotest.matchers.collections.shouldContainExactly
import org.junit.jupiter.api.Test
import org.junitpioneer.jupiter.StdIo
import org.junitpioneer.jupiter.StdOut

class MainTest {

    @Test
    @StdIo("""test""")
    fun test(out: StdOut) {
        main()
        out.capturedLines().shouldContainExactly("""test""")
    }

}
