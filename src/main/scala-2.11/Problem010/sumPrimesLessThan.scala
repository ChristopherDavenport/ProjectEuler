package Problem010

import scala.annotation.tailrec

/**
  * Created by davenpcm on 2/18/2016.
  * Another Option that doesn't scale
  */
object sumPrimesLessThan extends App {
  @tailrec
  def sumPrimes(primes: Long, // How many to take
                start: Long = 2, //
                primeList: List[Long] = List()
               ): (Long, Long) = start match {

    // No More Primes to Gather
    // So Sum primeList
    case enoughGathered if start > primes => (primeList.sum, primeList.length)

    // Quick Elimination of the
    // Most Common Denominators 2,3,5,7,11, 13, 17
    case divisibleByTwo if (start % 2 == 0) &&
      (start != 2) => sumPrimes(primes, start + 1, primeList)

    case divisibleByThree if (start % 3 == 0) &&
      (start != 3) => sumPrimes(primes, start + 1, primeList)

    case divisibleByFive if (start % 5 == 0) &&
      (start != 5) => sumPrimes(primes, start + 1, primeList)

    case divisibleBySeven if (start % 7 == 0) &&
      (start != 7) => sumPrimes(primes, start + 1, primeList)

    case divisibleByEleven if (start % 11 == 0) &&
      (start != 11) => sumPrimes(primes, start + 1, primeList)

    case divisibleByThirteen if (start % 13 == 0) &&
      (start != 13) => sumPrimes(primes, start + 1, primeList)

    case divisibleBySeventeen if (start % 17 == 0) &&
      (start != 17) => sumPrimes(primes, start + 1, primeList)

    // Check list
    case _ =>
      // List of possible denominators - We purposely lose all
      // primelist up to sqrt of start
      val isPrime = primeChecker(start, primeList.dropWhile(a => a * a > start))

      if (isPrime) {
        sumPrimes(primes, start + 1, start :: primeList)
      }
      else
        sumPrimes(primes, start + 1, primeList)
  }


  @tailrec
  def primeChecker(value: Long, modulusChecker: List[Long]): Boolean = modulusChecker match {
    case x::xs if value % x == 0 => false
    case x::xs => primeChecker(value, xs)
    case Nil => true
  }

  println(sumPrimes(2000000))
}

