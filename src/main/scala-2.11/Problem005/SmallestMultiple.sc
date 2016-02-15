/**
  * 2520 is the smallest number that can be divided by each of the numbers
  * from 1 to 10 without any remainder.
  * What is the smallest positive number that is evenly divisible by all
  * of the numbers from 1 to 20?
  *
  * This solution takes the divisors and utilizing a range generated by the list
  * of divisors outputs the first number that satisfies the criteria.
  *
  * @param divisibleBy
  * @return
  */

def smallestMultiple(divisibleBy: Range): Int = {

  def returnSmallest(possibleRange: Range, divisors: Range): Int = {
    possibleRange.find(n => divisibleBy.forall(n % _ == 0)).get
  }

  returnSmallest(Range(divisibleBy.max, Int.MaxValue, divisibleBy.max), divisibleBy)
}

smallestMultiple(1 to 10)
smallestMultiple(1 to 15)
smallestMultiple(1 to 20)

val range = 1 to 20

