

def generateFunction(arity: Int): String = {
  val returnType = if (arity < 9) s"io.vavr.Function$arity" else s"net.hamnaberg.json.util.F$arity"

  val aritytypes = (1 to arity).map(a => s"T$a").mkString(",")
  val arityargs = (1 to arity).map(a => s"t$a: T$a").mkString(",")
  val aritynames = (1 to arity).map(a => s"t$a").mkString(",")

  val body = if (arity < 9) s"""object: $returnType<$aritytypes, TT> {
    override fun apply($arityargs): TT {
      return invoke($aritynames)
    }
  }""" else s"$returnType(this)"

  s"""fun <$aritytypes,TT>(($aritytypes) -> TT).toJava(): $returnType<$aritytypes,TT> {
     |  return $body
     |}
   """.stripMargin
}

val functions = (1 to 27).map(arity => generateFunction(arity)).mkString("\n")

val path = java.nio.file.Paths.get("src/main/kotlin/Functions.kt")


val filecontent = s"""package net.hamnaberg.json.kotlin
  |
  |$functions
  |
""".stripMargin


java.nio.file.Files.write(
  path,
  filecontent.getBytes(java.nio.charset.StandardCharsets.UTF_8)
)
