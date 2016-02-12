import BigInt._
//def result(number: BigInt, list: List[BigInt] = List()): List[BigInt] = {
//
//  for(n <- BigInt(2) to number if number % n == 0) {
//    return result(number / n, list :+ n)
//  }
//  list
//}



//result(BigInt(13195)).last.toInt

//def result(number: BigInt, list: List[BigInt] = List()): List[BigInt] = {
//  var i = BigInt(2)
//  while (i <= number){
//    if (number % i == 0) {
//      result(number / i, list :+ i)
//    }
//  }
//  list
//}
//
//result(BigInt(600851475143L))

def largestPrimeFactor(bigNumber : BigInt) = {
  def loop(small:BigInt, large: BigInt): BigInt =
    if (small == large) large else // If the first number is equal to the second number -> answer!
    if (large % small == 0) loop(small, large / small)  // If f is a factor then
    // try  again to see if there is a larger factor
    else loop(small + 1, large) // loop until you find a factor

  loop (BigInt(2), bigNumber) // Start at 2
}

largestPrimeFactor(BigInt(600851475143L))