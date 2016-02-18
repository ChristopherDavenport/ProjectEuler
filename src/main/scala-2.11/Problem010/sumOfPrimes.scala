package Problem010

/**
  * Created by davenpcm on 2/18/2016.
  */
object sumOfPrimes extends App {
  def isPrime(num: Long) = {
    !(2L to math.sqrt(num).toInt).exists(num % _ == 0)
  }
  def sumPrimes(num: Long): Long = {
    2 + (3L to num by 2).filter(isPrime).sum
  }
  val answer = sumPrimes(2000000)
  println(answer)
}

