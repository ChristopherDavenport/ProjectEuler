def pythagoreantriples(sum: Int): ((Int,Int, Int),Int)= {
  val a = Range(1,sum)
  val b = Range(1, sum)

  var numberA = 0
  var numberB = 0
  var numberC = 0

  for(numA <- a; numB <- b if numB > numA){
    val numC = sum - numA - numB
    if (numA*numA+numB*numB ==numC*numC && numC > 0 && numA + numB + numC == sum){
      numberA = numA
      numberB = numB
      numberC = numC
    }
  }
  ((numberA,numberB,numberC), numberA * numberB * numberC)
}

pythagoreantriples(12)
pythagoreantriples(1000)

// Vector of All Pythagorean Triples between 1 and 1000 - Why not?
val Cool = {{1 to 1000 map (x => pythagoreantriples(x))}.filter(_._2 != 0)} map (x => x._1)