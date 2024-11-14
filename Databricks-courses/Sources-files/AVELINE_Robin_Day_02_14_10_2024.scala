// Databricks notebook source
// MAGIC %md
// MAGIC # Programming Paradigms
// MAGIC
// MAGIC - Imperative
// MAGIC - Functionnal
// MAGIC - Logic
// MAGIC - Object Oriented
// MAGIC

// COMMAND ----------

// MAGIC %md
// MAGIC Functional Programming (FP)
// MAGIC
// MAGIC - Functions
// MAGIC - Immutable
// MAGIC - Less code
// MAGIC - Parallelism

// COMMAND ----------

// MAGIC %md
// MAGIC Composable

// COMMAND ----------

f(x) = x*2
g(x) = x+2

// COMMAND ----------

h(x) = f(g(x))
     = f(x+2)
     = (x+2)*2

// COMMAND ----------

def f(x: Int): Int = x * 2

def g(x: Int): Int = x + 2

def h(x: Int): Int = f(g(x))

// COMMAND ----------

val input = 4
println(s"g($input) = ${g(input)}")
println(s"f($input) = ${f(input)}")
println(s"h($input) = ${f(g(input))}")

// COMMAND ----------

// MAGIC %md
// MAGIC # Scala programming language
// MAGIC
// MAGIC - Hybrid (OOP and FP)
// MAGIC - Statically typed
// MAGIC - Type-safe

// COMMAND ----------

val name: String = "Scala"
val age: Int = 25


// COMMAND ----------

val language: Int = "Scala"

// COMMAND ----------

def add(x: Int, y: Int): Int = x + y
val sum = add(10, 20)
println(s"Sum is: $sum")

// COMMAND ----------

val sumTest = add(10; "20")

// COMMAND ----------

// MAGIC %md
// MAGIC # Operators
// MAGIC
// MAGIC - Arithmetic
// MAGIC - Relational
// MAGIC - Logical

// COMMAND ----------

val x = 10
val y = 20
val z = x + y

// COMMAND ----------

// MAGIC %md
// MAGIC  "+" is not a built-in operator. It's a method defined in class Int

// COMMAND ----------

val z = x.+(y)

// COMMAND ----------

val z1 = x.*(y)

// COMMAND ----------

// MAGIC %md
// MAGIC # Traits (Interface)
// MAGIC
// MAGIC - method signature 
// MAGIC - concrete method implementationss

// COMMAND ----------

trait Shape{
  def area(): Int // Abstract method (no implementation)
}

class Square(length: Int) extends Shape{
  def area = length * length // Concrete implementation of the abstract method
}

class Rectangle(length: Int, width: Int) extends Shape{
  def area = length * width
}

val square = new Square(10)
val area = square.area

// COMMAND ----------

// MAGIC %md
// MAGIC # Tuples
// MAGIC
// MAGIC - container (store more element od different types)
// MAGIC - Immutable
// MAGIC

// COMMAND ----------

val twoElements = ("10", true)
val threeElements = ("10", "harry", true)

// COMMAND ----------

// MAGIC %md
// MAGIC Used for :
// MAGIC - non-related elements
// MAGIC - function that returns more than one value
// MAGIC - each element are one-based index

// COMMAND ----------

val fisrt = threeElements._1
val second = threeElements._2
val third = threeElements._3

// COMMAND ----------

// MAGIC %md
// MAGIC # Collections
// MAGIC - Container (0 or more elements)
// MAGIC - Three categories :
// MAGIC   - Sequences (Array, List, Vector)
// MAGIC   - Sets
// MAGIC   - Maps

// COMMAND ----------

// MAGIC %md
// MAGIC Sequences

// COMMAND ----------

// MAGIC %md
// MAGIC Array

// COMMAND ----------

val arr = Array(10, 20, 30, 40)

// COMMAND ----------

arr(0) = 50

// COMMAND ----------

val first = arr(0)

// COMMAND ----------

// MAGIC %md
// MAGIC List

// COMMAND ----------

val xs = List(10, 20, 30, 40)

// COMMAND ----------

val ys = (1 to 100).toList

// COMMAND ----------

val zs = arr.toList

// COMMAND ----------

zs.head

// COMMAND ----------

zs.tail

// COMMAND ----------

zs.isEmpty

// COMMAND ----------

// MAGIC %md
// MAGIC Vector

// COMMAND ----------

val v1 = Vector(0, 10, 20, 30, 40)

// COMMAND ----------

val v2 = v1 :+ 50

// COMMAND ----------

val v3 = v2 :+ 60

// COMMAND ----------

val v4 = v3(4)

// COMMAND ----------

// MAGIC %md
// MAGIC # Sets
// MAGIC - Unorderend
// MAGIC - Distinct elements
// MAGIC - No index
// MAGIC - Two basics operations : 
// MAGIC   - contains
// MAGIC   - isEmpty

// COMMAND ----------

val fruits = Set("apple", "orange", "pear", "banana")

// COMMAND ----------

fruits.contains("Ananas")

// COMMAND ----------

fruits.isEmpty()

// COMMAND ----------

// MAGIC %md
// MAGIC # Map
// MAGIC - key-value pairs

// COMMAND ----------

val capitals = Map("France" -> "Paris", "USA" -> "Washington D.C.", "UK" -> "London")

// COMMAND ----------

val FranceCapital = capitals("France")

// COMMAND ----------

// MAGIC %md
// MAGIC # High-Order Methods on Collection Classes

// COMMAND ----------

val myList = List(1, 2, 3, 4)

// COMMAND ----------

val myOtherList = myList.map((x: Int) => x * 10.0)

// COMMAND ----------

val myOtherList2 = myList.map( _ * 10.0)

// COMMAND ----------

// MAGIC %md
// MAGIC flatMap

// COMMAND ----------

val line = "Scala is fun"

// COMMAND ----------

val SingleSpace = " "

// COMMAND ----------

val words = line.split(SingleSpace)

// COMMAND ----------

val arrayOfListOfChars = words.map{x => x.toList}

// COMMAND ----------

val arrayOfCharrs = words.flatMap(x => x.toList)

// COMMAND ----------

// MAGIC %md
// MAGIC filter

// COMMAND ----------

val myNewList = (1 to 100).toList

// COMMAND ----------

val even = myNewList.filter{x => x%2 == 0}

// COMMAND ----------

val words = "Scala is fun".split(" ")

// COMMAND ----------

words.foreach(println)

// COMMAND ----------

// MAGIC %md
// MAGIC

// COMMAND ----------

val reduceList = List(2, 4, 6, 8, 10)

// COMMAND ----------

val sum = reduceList.reduce{(x, y) => x + y}

// COMMAND ----------

val sum = reduceList.reduce{(x, y) => x * y}
