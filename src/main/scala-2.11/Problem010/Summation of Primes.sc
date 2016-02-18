/**
  * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
  * Find the sum of all the primes below two million.
  *
  * Going to make an awesome primefinder algorithm since
  * my last one is not ideal for this
  **/
// I may come back to this for a list return,
// however is massively inefficient if I can accumulate.

//def sumPrimes(primes: Long,                     // How many to take
//              start: Long = 2,                 //
//              primeList: List[Long] = List()
//             ): Long = start match {
//
//  // No More Primes to Gather
//  // So Sum primeList
//  case enoughGathered if primes == primeList.length => primeList.sum
//
//  // Quick Elimination of the
//  // Most Common Denominators 2,3,5,7,11, 13, 17
//  case divisibleByTwo if (start % 2 == 0) &&
//    (start != 2) => sumPrimes(primes, start + 1, primeList)
//
//  case divisibleByThree if (start % 3 == 0) &&
//    (start != 3) => sumPrimes(primes, start + 1, primeList)
//
//  case divisibleByFive if (start % 5 == 0) &&
//    (start != 5) => sumPrimes(primes, start + 1, primeList)
//
//  case divisibleBySeven if (start % 7 == 0) &&
//    (start != 7) => sumPrimes(primes, start + 1, primeList)
//
//  case divisibleByEleven if (start % 11 == 0) &&
//    (start != 11) => sumPrimes(primes, start + 1, primeList)
//
//  case divisibleByThirteen if (start % 13 == 0) &&
//    (start != 13) => sumPrimes(primes, start + 1, primeList)
//
//  case divisibleBySeventeen if (start % 17 == 0) &&
//    (start != 17) => sumPrimes(primes, start + 1, primeList)
//
//  // Check list
//  case _ =>
//    val possibleDenoms = primeList.dropWhile(_ >= Math.sqrt(start))
//    val denomCheck = for (denom <- possibleDenoms) yield start % denom
//    if (denomCheck.product != 0) {
//      sumPrimes(primes, start + 1, start :: primeList)
//    }
//    else {
//      sumPrimes(primes, start + 1, primeList)
//    }
//
//}
//
//sumPrimes(10000)


