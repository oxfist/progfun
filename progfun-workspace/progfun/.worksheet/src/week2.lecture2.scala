package week2

object lecture2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(67); 
	def cube(a: Int): Int =	a * a * a;System.out.println("""cube: (a: Int)Int""");$skip(92); 
	def sum(f: Int => Int)(a: Int, b: Int): Int =
		if (a > b) 0 else f(a) + sum(f) (a + 1, b);System.out.println("""sum: (f: Int => Int)(a: Int, b: Int)Int""");$skip(101); 
  def product(f: Int => Int)(a: Int, b:Int): Int =
  	if (a > b) 1 else f(a) * product(f) (a + 1, b);System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(37); val res$0 = 
  	
  product(x => x * x * x) (1, 3);System.out.println("""res0: Int = """ + $show(res$0));$skip(52); 
  
  def fact(n: Int): Int = product(x => x) (1, n);System.out.println("""fact: (n: Int)Int""");$skip(13); val res$1 = 
  
  fact(2);System.out.println("""res1: Int = """ + $show(res$1));$skip(10); val res$2 = 
  fact(3);System.out.println("""res2: Int = """ + $show(res$2));$skip(10); val res$3 = 
  fact(4);System.out.println("""res3: Int = """ + $show(res$3));$skip(11); val res$4 = 
  fact(10);System.out.println("""res4: Int = """ + $show(res$4))}
  
  
  	
}
