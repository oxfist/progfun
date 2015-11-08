object Fibonacci {
  def fibonacci(n: Int): Int =
    if (n == 0 || n == 1)
      n
    else
      if (n == 2)
        1
      else
        fibonacci(n - 1) + fibonacci(n - 2)

  def fibonacciTR(n: Int, a: Int, b: Int): Int = {
    if (n == 0)
      a
    else
      if (n == 1)
        b
      else
        fibonacciTR(n - 1, b, a + b)
  }
}
