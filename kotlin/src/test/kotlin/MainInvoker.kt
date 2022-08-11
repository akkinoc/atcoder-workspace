import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class MainInvoker(private val fn: () -> Unit = { main() }, private val log: PrintStream = System.out) {

    operator fun invoke(input: String): String {
        val result = runCatching { input(input) { output { fn() } } }
        log.println("--------------------------------------------------")
        log.println("[INPUT]")
        log.println(input.removeSuffix(System.lineSeparator()))
        result.getOrNull()?.also { output ->
            log.println("[OUTPUT]")
            log.println(output.removeSuffix(System.lineSeparator()))
        }
        result.exceptionOrNull()?.also { error ->
            log.println("[ERROR]")
            log.println("$error".removeSuffix(System.lineSeparator()))
        }
        log.println("--------------------------------------------------")
        return result.getOrThrow()
    }

    private fun <R> input(input: String, fn: () -> R): R {
        return ByteArrayInputStream(input.toByteArray()).use { inputStream ->
            val origin = System.`in`.also { System.setIn(inputStream) }
            runCatching { fn() }.also { System.setIn(origin) }.getOrThrow()
        }
    }

    private fun output(fn: () -> Unit): String {
        return ByteArrayOutputStream().use { outputStream ->
            PrintStream(outputStream).use { printStream ->
                val origin = System.out.also { System.setOut(printStream) }
                runCatching { fn() }.also { System.setOut(origin) }.getOrThrow()
                String(outputStream.toByteArray())
            }
        }
    }

}
