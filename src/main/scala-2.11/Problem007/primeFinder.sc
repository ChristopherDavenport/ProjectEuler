import scala.annotation.tailrec
import scala.collection.immutable.SortedSet
import scala.compat.Platform
/**
  * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
  * we can see that the 6th prime is 13.
  * What is the 10,001st prime number?
  *
  * Got help, need to reimplement with only my work
  **/
def isPrime(num: Int, mod: Int = 2): Boolean = {
  // First cutoff is at sqrt of number
  num < mod * mod || (
    num % mod match {
        // If % is zero then if it is the same number great - EXTREMELY WEAK
      case 0 => if (num == mod) true else false
        // Count up by 1 - Also not ideal but it works
      case _ => isPrime(num, mod + 1)
    })
}
def primeFinder(
                 prime: Int,
                 num: Int = 2,
                 primeCount: Int = 0): Int = {
  if (primeCount == prime) num -1
  else primeFinder(
    prime,
    num + 1,
    if(isPrime(num)) primeCount+1 else primeCount
  )
}


primeFinder(10001)