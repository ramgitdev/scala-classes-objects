package com.pluralsight.learning

import java.time.LocalDateTime
import java.util.UUID

abstract class Account(id: UUID, name: String, dateOpened: LocalDateTime) {
  private val _id = id
  private var _name = name
  private val _dateOpened = dateOpened
  val _accountType:String

  def this(name: String) {
    this(UUID.randomUUID(), name, LocalDateTime.now)
  }

  def getId:UUID = _id
  def getName:String = _name
  def getDateOpened :LocalDateTime = _dateOpened

  def updateName(newName:String) = _name = newName

  def getAccountType:String = _accountType

  override def toString: String = s"Account id = ${_id},name=${_name},dateOpened=${_dateOpened}"

}
class CreditAccount(name:String) extends Account(name:String){
 // private val _accountType = "Credit"
  // def getAccountType:String = _accountType
  override val _accountType: String = "Credit"

  override def toString: String = s"Credit Account id = ${getId},name=${name},dateOpened=${getDateOpened} , accountType=${_accountType}"
}

class DepositAccount(name:String) extends Account(name:String){
  //private val _accountType = "Deposit"
  //def getAccountType:String = _accountType
  override val _accountType: String = "Deposit"

  override def toString: String = s"Deposit Account Id =${getId},name = ${getName},dateOpened=${getDateOpened}, accountype= ${_accountType}"
}



object AccountRunner extends App {

  val ca1:Account= new CreditAccount("Travel MasterCard")
  println(ca1.getId,ca1.getName,ca1.getDateOpened,ca1.getAccountType)

  println(ca1)
  val ca2:Account= new DepositAccount("Saving")
  println(ca2.getId,ca2.getName,ca2.getDateOpened,ca2.getAccountType)
  //toString.foreach(println)

  println(ca2)
  /*val a1 = new Account(UUID.randomUUID(), "Account01", LocalDateTime.now())
  val a2 = new Account(UUID.randomUUID(), "Account02", LocalDateTime.now.plusHours(6))
  val a3 = new Account( "Account03")


  a1.updateName("Updated Account 01")
  println(a1.getId, a1.getName, a1.getDateOpened)
  println(a2.getId, a2.getName, a2.getDateOpened)
  println(a3.getId, a3.getName, a3.getDateOpened)

  //a1._name="Update Account 01"
  println(a1.getId, a1.getName, a1.getDateOpened)*/
}
