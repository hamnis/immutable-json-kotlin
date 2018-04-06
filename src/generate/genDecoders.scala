
def generate(arity: Int): String = {
  val aritytypes = (1 to arity).map(a => s"T$a").mkString(", ")
  val fdtypes = (1 to arity).map(a => s"fd$a: FD<T$a>").mkString(", ")
  val fds = (1 to arity).map(a => s"fd$a").mkString(", ")


  s"""fun <$aritytypes, TT> decode($fdtypes, f: ($aritytypes) -> TT): DecodeJson<TT> {
    |  return JDecoders.decode($fds, f.toJava())
    |}
    |""".stripMargin
}

val body = (1 to 27).map(generate).mkString("\n")

//println(generate(1))

val filecontent = s"""
  |package net.hamnaberg.json.codec.kotlin
  |
  |import net.hamnaberg.json.codec.DecodeJson
  |import net.hamnaberg.json.kotlin.toJava
  |import net.hamnaberg.json.codec.KotlinDecoders as JDecoders
  |import net.hamnaberg.json.codec.FieldDecoder as FD
  |
  |object KotlinDecoders {
  |  $body
  |}
  |
""".stripMargin

val path = java.nio.file.Paths.get("src/main/kotlin/KotlinDecoders.kters.kt")

java.nio.file.Files.write(
  path,
  filecontent.getBytes(java.nio.charset.StandardCharsets.UTF_8)
)
