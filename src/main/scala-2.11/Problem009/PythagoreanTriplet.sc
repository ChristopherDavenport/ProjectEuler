def pythagoreantriples(sum: Int): ((Int,Int, Int),Int)= {
  val a = Range(1,sum)
  val b = Range(1, sum)

  var numberA = 0
  var numberB = 0
  var numberC = 0

  for(numA <- a; numB <- b if numB > numA){
    val numC = 1000 - numA - numB
    if (numA*numA+numB*numB ==numC*numC && numC > 0){
      numberA = numA
      numberB = numB
      numberC = numC
    }

  }
  if(numberA + numberB + numberC == sum)
  ((numberA,numberB,numberC), numberA * numberB * numberC)
  else
    ((numberA,numberA,numberC),-1)
}

pythagoreantriples(25000)

