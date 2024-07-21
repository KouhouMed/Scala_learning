object Basics extends App{
  // defining a value
  val meaningOfLife: Int = 42 // const int meaningOfLife = 42;

  // Int, Boolean, Char, Double, Float, String
  val aBoolean = false // type is optional

  // strings and string operations
  val aString = "I love Scala"
  val aComposedString = "I " + "love " + "Scala"
  val anInterpolatedString = s"Meaning of life is $meaningOfLife"

  // expressions = structures that can be reduced to a value
  val anExpression = 2 + 5

  // if-expresions
  val ifExpression = if (meaningOfLife > 43) 500 else 400
  val chainedIfExpression =
    if (meaningOfLife > 43) 500
    else if (meaningOfLife > 45) 364
    else if (meaningOfLife < 0) 45
    else 0

  // code blocks
  val aCodeBlock = {
    // definitions
    val aLocalValue = 5

    // value of block is the value of the last expression
    aLocalValue + 2
  }
  // define a function
  def myFunction(x: String, y: String): String = {
    x + " " + y
  }

  // recursive function
  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else n * factorial(n-1)
  }

  // In Scala we don't use loops or iteration, we use RECURSION!

  // the Unit type = no meaningful value === "void" in other languages
  // type of SIDE EFFECTS
  def myUnitReturningFunction(): Unit = {
    println("I don't love returning Unit")
  }

  val theUnit = ()
}
