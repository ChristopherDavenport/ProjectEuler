package Problem010

/**
  * Created by davenpcm on 2/18/2016.
  */
object sumPrimes extends App{
  def sumPrimes(limit: Int): Long = {
    def prime(n: Int) =
      Iterator.range(5, math.sqrt(n).toInt + 1) forall { n % _ > 0 }
    var sum: Long = 2 + 3
    for (i <- Iterator.from(1); j <- List(-1, 1)) {
      val n = 6 * i + j
      if (n > limit) return sum
      if (prime(n)) sum += n
    }
    sum
  }
  val answer = sumPrimes(2000000)
  println(answer)
}
