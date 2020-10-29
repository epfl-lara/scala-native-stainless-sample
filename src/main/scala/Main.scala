package StainlessNativeTest

object Main {
  import scala.language.implicitConversions
  import stainless.annotation._
  import stainless.lang.StaticChecks._
  import stainless.collection.List._
  import stainless.collection._

  def transform(l: List[BigInt]) : List[BigInt] = {
    ListOps.sorted(l)
  }.ensuring(res => ListOps.isSorted(res))

  @extern
  def main(args: Array[String]): Unit = {
    println("Hello, world!")
    println(Left[Int,Int](42))
    println(fill(10)(7))
    val l1 = Cons(BigInt(10), Cons(BigInt(3), Cons(
      BigInt(500), Cons(BigInt(-7), Cons(BigInt(10), Nil[BigInt]())))))
    println(l1 + " ==> " + transform(l1))
    println
  }
}
