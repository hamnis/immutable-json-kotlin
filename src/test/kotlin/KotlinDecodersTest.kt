package net.hamnaberg.json.codec.kotlin

import io.vavr.control.Option
import io.vavr.control.Try
import net.hamnaberg.json.codec.FieldDecoder
import net.hamnaberg.json.codec.Decoders as JDecoders
import net.hamnaberg.json.jackson.JacksonStreamingParser
import org.junit.Assert.assertEquals
import org.junit.Test
import java.time.LocalDate
import java.util.*

class KotlinDecodersTest {

    @Test
    fun person() {

        data class Person(val name: String, val age: Int)

        val json = """{"name": "Erlend", "age": 37}"""

        val maybePerson = JacksonStreamingParser().decode(json, KotlinDecoders.decode(FieldDecoder.TString("name"), FieldDecoder.TInt("age"), ::Person))

        assertEquals(Person("Erlend", 37), maybePerson.unsafeGet())
    }

    @Test
    fun arity9() {

        data class Arity9(val a1: String, val a2: Int, val a3: Boolean, val a4: UUID, val a5: LocalDate, val a6: Long, val a7: Int, val a8: Option<String>, val a9: List<String>)

        val a4 = UUID.randomUUID()
        val a6 = 3456789045678L

        val json = """{"a1": "Erlend", "a2": 37, "a3": false, "a4": "$a4", "a5": "2018-01-01", "a6": $a6, "a7": 1234, "a8": null, "a9": ["yeah"]}"""

        val decoder = KotlinDecoders.decode(
                FieldDecoder.TString("a1"),
                FieldDecoder.TInt("a2"),
                FieldDecoder.TBoolean("a3"),
                FieldDecoder.typedFieldOf("a4", JDecoders.DUUID),
                FieldDecoder.typedFieldOf("a5", JDecoders.DString.tryMap { Try.ofSupplier { LocalDate.parse(it) } }),
                FieldDecoder.TLong("a6"),
                FieldDecoder.TInt("a7"),
                FieldDecoder.TOptional("a8", JDecoders.DString),
                FieldDecoder.TJavaList("a9", JDecoders.DString)
                , ::Arity9)

        val maybea9 = JacksonStreamingParser().decode(json, decoder)

        assertEquals(Arity9("Erlend", 37, false, a4, LocalDate.of(2018, 1, 1), a6, 1234, Option.none(), listOf("yeah")), maybea9.unsafeGet())
    }
}