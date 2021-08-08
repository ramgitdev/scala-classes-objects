package Implicits

object ImplicitsClass {

  sealed trait Currency
  object Currency{
    case object SGD extends Currency
    case object INR extends Currency
    case object USD extends Currency

    type SGD = SGD.type
    type USD = USD.type
    type INR = INR.type
  }

  case class Amount[T <:Currency](value:Double ,currency: T)
  import Currency._

  def addAmounts[T <:Currency](amt1:Amount[T],amt2:Amount[T]):Amount[T]=
    Amount(amt1.value + amt2.value, amt1.currency)

  def main(args:Array[String]):Unit ={
    val oneUSD = Amount(1,USD)
    val tenUSD = Amount(10,USD)

    //println(addAmounts)
  }
}
