package dev.akkinoc.atcoder.workspace.kotlin.test

import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

/**
 * The main function invoker.
 *
 * @property log The logger.
 * @property fn The function that invokes the main function.
 */
class MainInvoker(private val log: PrintStream = System.out, private val fn: () -> Unit) {

    /**
     * Invokes the main function.
     *
     * @param input The standard input.
     * @return The standard output.
     */
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

    /**
     * Replaces the standard input and runs the function.
     *
     * @param <R> The return value type of the function.
     * @param input The standard input.
     * @param fn The function.
     * @return The return value of the function.
     */
    private fun <R> input(input: String, fn: () -> R): R {
        return ByteArrayInputStream(input.toByteArray()).use { inputStream ->
            val origin = System.`in`.also { System.setIn(inputStream) }
            runCatching { fn() }.also { System.setIn(origin) }.getOrThrow()
        }
    }

    /**
     * Replaces the standard output and runs the function.
     *
     * @param fn The function.
     * @return The standard output.
     */
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
