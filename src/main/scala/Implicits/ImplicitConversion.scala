package Implicits
object StringConversions{
  implicit def tokenizer(str:String):List[String]=str.split(" ").toList
}
object ImplicitConversion {

  def capitalizer(words:List[String]):List[String]= words.map(w => w.capitalize)

import StringConversions._
  def main(args:Array[String]):Unit ={
    val words = List(" This","is","simply","awesome")
    //println(capitalizer(words))
    val title ="scala implicits why, what and how"
    println(capitalizer(title).mkString(" "))
  }
}
