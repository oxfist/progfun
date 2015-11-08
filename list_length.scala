object ListLength {
  def listLength(list: List[Int]): Int =
    if (list.isEmpty)
      0
    else
      listLength(list.tail) + 1

  def listLengthTR(list: List[Int], 
}
