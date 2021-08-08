
case class Currency(code:String, amount:Double, toUSD:Double)

object Implicits extends App{
  //money = "USD 100"

  implicit def toStringCurrency(money:String):Currency={
    val Array(code:String, value:String) = money.split("\\s+")
    val amountAsDouble = value.toDouble
    code match {
      case "USD" => Currency("USD", amountAsDouble , amountAsDouble*(1))
      case "NZD" => Currency("USD", amountAsDouble , amountAsDouble*(1/1.5))
      case "CAD" => Currency("USD", amountAsDouble , amountAsDouble*(1/1.3))
    }

  }
  println(toStringCurrency("USD 200"))
  println(toStringCurrency("NZD 200"))
  println(toStringCurrency("CAD 200"))

  val cad:Currency = "USD 100"
  println(cad)
}