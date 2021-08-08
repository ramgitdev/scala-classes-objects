def square(x:Int):Int =
   x*x

val sq_2 = square(4)

def multiply (x:Int,y:Int) = x*y
multiply(6,4)
def multiply(nums:Int*):Int = {
  var product=1
  for(num <- nums) product= product *num
  product
}
val mul = multiply(123,56,5,664,8,54,5,4)
println(mul)

def sum(nums:Int*):Int={
  var sum = 1
  for (num <- nums) sum = sum + num
  sum
}

sum(65,894,849,849489,4,489)