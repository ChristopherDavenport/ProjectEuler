def FizzBuzzFilter (a: Range): IndexedSeq[Int] = {
  for (x <- a ; if x % 3 == 0 || x % 5 == 0) yield x
}
def MultiplesOfThreeAndFiveSum(a:Range): Int = {
  FizzBuzzFilter(a).sum
}

MultiplesOfThreeAndFiveSum(1 to 999)