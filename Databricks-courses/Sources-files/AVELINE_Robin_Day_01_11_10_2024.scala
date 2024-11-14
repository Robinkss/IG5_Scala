// Databricks notebook source
print("hello world")

// COMMAND ----------

var x = 10

// COMMAND ----------

x = 20

// COMMAND ----------

val y = 5

// COMMAND ----------

y = 10

// COMMAND ----------

// MAGIC %md
// MAGIC Functions

// COMMAND ----------

def add(firstInput: Int, secondInput: Int): Int = {
  val sum = firstInput + secondInput
  return sum
}

// COMMAND ----------

val addNumbers = add(5376, 6256)

// COMMAND ----------

def addSimple(firstInput: Int, secondInput: Int) = firstInput + secondInput

// COMMAND ----------

val addNumbers2 = addSimple(5376, 6256)

// COMMAND ----------

// MAGIC %md
// MAGIC High-Order Functions

// COMMAND ----------

def encode(n: Int, f: (Int) => Long): Long = {
  val x = n * 10
  f(x)
}

// COMMAND ----------

val higherOrderFunctionTest1 = encode (10, (x: Int) => {x+100})

// COMMAND ----------

val higherOrderFunctionTest2 = encode (5, (x: Int) => {x+100})

// COMMAND ----------

val higherOrderFunctionTest3 = encode (5, x => x + 100)

// COMMAND ----------

val higherOrderFunctionTest2 = encode (5, _ + 100)

// COMMAND ----------

// MAGIC %md
// MAGIC Classes

// COMMAND ----------

class Car(mk: String, ml: String, cr:String){
  val make = mk
  val model = ml
  var color = cr
  def repaint(newColor: String) = {
    color = newColor
  }
}

// COMMAND ----------

val mustang = new Car("Ford", "Mustang", "Red")
val corverte = new Car("GM", "Corvette", "Black")

// COMMAND ----------

mustang.repaint("Blue")

// COMMAND ----------

// MAGIC %md
// MAGIC Singletons

// COMMAND ----------

// MAGIC %md
// MAGIC Case Classes

// COMMAND ----------

case class Message(from: String, to: String, content: String)
// This is actually equivalent to 
// class Message(val from: String, val to: String, val content: String)

// COMMAND ----------

val request = Message("harry", "sam", "discussion")

// COMMAND ----------

// MAGIC %md
// MAGIC Pattern Matching

// COMMAND ----------

def colorToNumber(color : String): Int = {
  val num = color match {
    case "Red" => 1
    case "Blue" => 2
    case "Green" => 3
    case "Yellow" => 4
    case _ => 0
  }
  num
}

// COMMAND ----------

val colorName = "Red"
val colorCode = colorToNumber(colorName)
println(s"The color code for $colorName is $colorCode")

// COMMAND ----------

val colorName2 = "Purple"
val colorCode2 = colorToNumber(colorName2)
println(s"The color code for $colorName2 is $colorCode2")

// COMMAND ----------

def f(x : Int, y : Int, operator: String): Double = {
  operator match {
    case "+" => x + y
    case "-" => x - y
    case "*" => x * y
    case "/" => x / y.toDouble
  }
}

// COMMAND ----------

val sum = f(10, 20, "+")
val product = f(10, 20, "*")

// COMMAND ----------

def squareNumber(x : Int): Int ={
  return x * x
}

val x = squareNumber(10)
