package week2

import math.abs

object lecture2_3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
	val tolerance = 0.0001;System.out.println("""tolerance  : Double = """ + $show(tolerance ));$skip(79); 

	def isCloseEnough(x: Double, y: Double) =
		abs((x - y) / x) / x < tolerance;System.out.println("""isCloseEnough: (x: Double, y: Double)Boolean""");$skip(224); 

  def fixedPoint(f:Double => Double)(firstGuess: Double) = {
  	def iterate(guess: Double): Double = {
  		val next = f(guess)
  		if (isCloseEnough(guess, next)) next
  		else iterate(next)
  	}
  	iterate(firstGuess)
  };System.out.println("""fixedPoint: (f: Double => Double)(firstGuess: Double)Double""");$skip(73); 
  
  def averageDamp(f: Double => Double)(x: Double) =
  	(x + f(x)) / 2;System.out.println("""averageDamp: (f: Double => Double)(x: Double)Double""");$skip(133); 
  	
  //def sqrt(x: Double) = fixedPoint(y => (y + x / y) / 2)(1.0)
  def sqrt(x: Double) = fixedPoint(averageDamp(y => x / y))(1.0);System.out.println("""sqrt: (x: Double)Double""");$skip(13); val res$0 = 
  
  sqrt(2);System.out.println("""res0: Double = """ + $show(res$0))}
}
