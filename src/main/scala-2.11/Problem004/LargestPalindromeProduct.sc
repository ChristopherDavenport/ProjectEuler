/**
  * A palindromic number reads the same both ways.
  * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
  *
  * Find the largest palindrome made from the product of two 3-digit numbers.
**/
  {for ( a <- 100 to 999; b <- 100 to 999) yield a * b}.filter(
    number =>
      number.toString == number.toString.reverse
  ) max