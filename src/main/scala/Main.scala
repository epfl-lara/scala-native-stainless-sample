package StainlessNativeTest

object Main {
  import scala.language.implicitConversions
  import stainless.annotation.*
  import stainless.lang.StaticChecks.*
  import stainless.collection.List.*
  import stainless.collection.*

  def transform(l: List[BigInt]) : List[BigInt] = {
    ListOps.sorted(l)
  }.ensuring(res => ListOps.isSorted(res))

  def l1 = Cons(BigInt(10), Cons(BigInt(3), Cons(
                BigInt(500), Cons(BigInt(-7), Cons(BigInt(10), Nil[BigInt]())))))

  @extern
  def main(args: Array[String]): Unit = {
    println("Hello, world!")
    println(Left[Int,Int](42))
    println(fill(10)(7))
    println(l1)
    ExplicitMemory.test
  }
}
