package week3

object intsets {
  val t1 = new NonEmpty(3, new Empty, new Empty)  //> t1  : week3.NonEmpty = {.3.}
  val t2 = t1 incl 4                              //> t2  : week3.IntSet = {.3{.4.}}
}

abstract class IntSet {
	def incl(x: Int): IntSet
	def contains(x: Int): Boolean
	def union(other: IntSet): IntSet
}

class Empty extends IntSet {
	def contains(x: Int): Boolean = false
	
	// Add an element
	def incl(x: Int): IntSet = new NonEmpty(x, new Empty, new Empty)
	
	override def toString: String = "."
	
	def union(other: IntSet): IntSet = other
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
	def contains(x: Int): Boolean =
		if (x < elem) left contains x
		else if (x > elem) right contains x
		else true
		
	def incl(x: Int): IntSet =
		if (x < elem) new NonEmpty(elem, left incl x, right)
		else if (x > elem) new NonEmpty(elem, left, right incl x)
		else this
		
	// Override parent toString method
	override def toString: String = "{" + left + elem + right + "}"
	
	def union(other: IntSet): IntSet = ((left union right) union other) incl elem
}