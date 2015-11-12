package week2

import math.abs

object rationals {
  val x = new Rational(1, 3)                      //> x  : week2.Rational = 1/3
  x.numer                                         //> res0: Int = 1
  x.denom                                         //> res1: Int = 3
  -x                                              //> res2: week2.Rational = 1/-3
  
  val y = new Rational(5, 7)                      //> y  : week2.Rational = 5/7
  
  x + y                                           //> res3: week2.Rational = 22/21
  x + y                                           //> res4: week2.Rational = 22/21
  x + -y                                          //> res5: week2.Rational = 8/-21
  x.eval                                          //> res6: Double = 0.3333333333333333
  -x.eval                                         //> res7: Double = -0.3333333333333333
  y.eval                                          //> res8: Double = 0.7142857142857143
  
  val z = new Rational(3, 2)                      //> z  : week2.Rational = 3/2
  val w = new Rational(-5, -3)                    //> w  : week2.Rational = 5/3
  -w                                              //> res9: week2.Rational = -5/3
  
  x - y - z                                       //> res10: week2.Rational = -79/42
  y + y                                           //> res11: week2.Rational = 10/7
  x < y                                           //> res12: Boolean = true
  x.max(y)                                        //> res13: week2.Rational = 5/7
  
  new Rational(2)                                 //> res14: week2.Rational = 2/1
}

class Rational(x: Int, y: Int) {
	require(y != 0, "denominator but be nonzero") // A predefined function (test) performed inside the class
	
	def this(x: Int) = this(x, 1) // this in this context is a constructor of the class
	
	private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
	val numer = x
	val denom = y
	
	def < (that: Rational): Boolean = numer * that.denom < that.numer * denom
	
	def max(that: Rational): Rational = if (this < that) that else this
	
	// Function identifiers can also be symbols
	// We replace 'add' with '+'
	def + (that: Rational): Rational =
		new Rational(
			numer * that.denom + that.numer * denom,
			denom * that.denom
		)
		
	def - (that: Rational): Rational = this + -that
		
	override def toString: String = {
		val g = gcd(numer, denom)
		numer / g + "/" + denom / g
	}
	
	def eval: Double = numer.toDouble / denom
	
	// Special notation for unary operator '-', preceded by 'unary_', denoting the '-' is a unary operator
	def unary_- : Rational =
		if (numer < 0 && denom < 0)
			new Rational(numer, -denom)
		else
			if (numer > 0 && denom > 0)
				new Rational(-numer, denom)
			else
				new Rational(abs(numer), abs(denom))
	
}