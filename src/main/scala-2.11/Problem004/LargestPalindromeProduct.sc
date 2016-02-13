/**
  * A palindromic number reads the same both ways.
  * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
  *
  * Find the largest palindrome made from the product of two 3-digit numbers.
**/
//  {for ( a <- 900 to 999; b <- 900 to 999) yield a * b}.filter(
//    number =>
//      number.toString == number.toString.reverse
//  ) max

def largestPalindromeProduct(range: Range, secondRange: Range): Int = {
  {for ( a <- range; b <- range)
    yield a * b
  }.filter{
    number =>
      number.toString == number.toString.reverse
  } max
}
largestPalindromeProduct(10 to 99, 10 to 99)
largestPalindromeProduct(100 to 999, 100 to 999)
largestPalindromeProduct(9500 to 9999, 9500 to 9999)
largestPalindromeProduct(99000 to 99999,99000 to 99999)

//def largestPalindromeProduct(upperRange: Int): Int = {
//
//  def largestPalindrome(range: List[Int], secondRange: List[Int]): Int = {
//    {for ( a <- range; b <- range)
//      yield a * b
//    }.filter{
//      number =>
//        number.toString == number.toString.reverse
//    } max
//  }
//
//  def yieldLargest(upper: Int): Int = {
//    val small = upper * 0.999
//    largestPalindrome( small to upper, small to upper)
//  }
//  def pointZeroOne()
//
//  try {
//
//  }
//}