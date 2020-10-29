package StainlessNativeTest

sealed abstract class Either[A, B] {
  def isLeft: Boolean
  def isRight: Boolean
  def swap: Either[B,A]

  def map[C](f: B => C): Either[A, C] = this match {
    case Left(a)  => Left(a)
    case Right(b) => Right(f(b))
  }

  def flatMap[C](f: B => Either[A, C]): Either[A, C] = this match {
    case Left(a)  => Left(a)
    case Right(b) => f(b)
  }

  def get: B = {
    require(isRight)
    val Right(value) = this
    value
  }
}

final case class Left[A,B](content: A) extends Either[A,B] {
  def isLeft  = true
  def isRight = false
  def swap    = Right[B, A](content)
}

final case class Right[A,B](content: B) extends Either[A,B] {
  def isLeft  = false
  def isRight = true
  def swap    = Left[B, A](content)
}
