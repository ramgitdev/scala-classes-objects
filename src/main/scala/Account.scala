import java.time.LocalDateTime
import java.util.UUID

class Account (id:UUID,name:String,dateOpened:LocalDateTime){
  val _id:UUID = id
  val _name:String = name
  val _dateOpened:LocalDateTime = dateOpened

  def this(name:String){
    this(UUID.randomUUID(),name,LocalDateTime.now)
  }
}

object AccountRunner extends App{
  val a1 = new Account(UUID.randomUUID(),name="Account-01",dateOpened = LocalDateTime.now  )
  val a2 = new Account(UUID.randomUUID(),"Account 01",LocalDateTime.now().plusHours(6))
val a3 = new Account("Account3")

 // a1._name="Update account 01"
 // a1._id = UUID.randomUUID()

  println(a1._id,a1._name,a1._dateOpened)
  println(a2._id,a2._name,a2._dateOpened)
  println(a3._id,a3._name,a3._dateOpened)

  import Implicits.toStringCurrency
  val cad:Currency = "CAD 100"
  println(cad)

}