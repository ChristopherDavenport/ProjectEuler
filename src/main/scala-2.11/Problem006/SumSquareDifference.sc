/**
  *     The sum of the squares of the first ten natural numbers is,
  *
  *  12 + 22 + … + 102 = 385
  *  The square of the sum of the first ten natural numbers is,
  *
  *  (1 + 2 + … + 10)2 = 552 = 3025
  *
  *  Hence the difference between the sum of the squares of the first ten
  *  natural numbers and the square of the sum is 3025 – 385 = 2640.
  *
  *  Find the difference between the sum of the squares of the first one hundred
  *  natural numbers and the square of the sum.
  */

import math.abs

def sumSquareDifference(range: Range): Int = {
  def sumOfSquares(r: Range): Int = {
    r.map(r => r * r).sum
  }
  def squareOfSum(r: Range): Int = {
    range.sum * range.sum
  }
  abs(sumOfSquares(range)- squareOfSum(range))
}

sumSquareDifference(1 to 10)
sumSquareDifference(1 to 100)

