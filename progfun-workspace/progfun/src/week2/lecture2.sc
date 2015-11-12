package week2

object lecture2 {
	def cube(a: Int): Int =	a * a * a
	def sum(f: Int => Int)(a: Int, b: Int): Int =
		if (a > b) 0 else f(a) + sum(f) (a + 1, b)
  def product(f: Int => Int)(a: Int, b:Int): Int =
  	if (a > b) 1 else f(a) * product(f) (a + 1, b)
  	
  product(x => x * x * x) (1, 3)
  
  def fact(n: Int): Int = product(x => x) (1, n)
  
  fact(2)
  fact(3)
  fact(4)
  fact(10)
  
  
  	
}