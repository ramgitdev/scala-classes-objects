package com.pluralsight.learning

import com.pluralsight.learning.Currency.conversionTable

object Currency{
  private val conversionTable:Map[String,Double]= Map("CAD"-> 1/1.30, "NZD" -> 1/1.50 )
  def apply(code:String,amount:Double) = new Currency(code,amount)
  def createUSD(amount:Double) = new Currency("USD",amount)
  def createNZD(amount:Double) = new Currency("NZD",amount)
  def createCAD(amount:Double) = new Currency("CAD",amount)
}

class Currency (code:String,amount:Double){

//private val conversionTable:Map[String,Double]= Map("CAD" -> 1/1.30,"NZD"-> 1/1/50)
  private val _code = code
  private val _amount = amount
  private val _inUSD:Double = getCostInUsd

  private def getCostInUsd:Double ={
    _code match {
      case "USD" => _amount
      case "NZD" => _amount * conversionTable("NZD")
      case "CAD" => _amount * conversionTable("CAD")
      case _ => throw new IllegalArgumentException(s"No conversion available for ${_code}")
    }
  }

  override def toString: String = s"${code} ${amount} = USD ${_inUSD}"
}
object CurrencyRunner extends App{
  val usd1 = new Currency(code ="USD",amount= 100.12)
  println(usd1)
  val nzd2 = new Currency(code = "NZD",amount = 100.12)
  println(nzd2)
  //val cad1 = new Currency(code = "CAD",amount = 100.12)
  println(cad1)
  import  Currency._
 // val

 // usd1 = createUSD(25)
  val nzd1 = createUSD(25)
  val cad1 = createUSD(25)
}