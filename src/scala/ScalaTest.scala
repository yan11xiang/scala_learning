package scala

/**
  * @author 小C
  * @since 2017/5/7
  */
object ScalaTest {

  def main(args: Array[String]) {
//    var randSent = "I saw a dragon fly by"
//    println("String length :" + randSent.length)
//
//    println(randSent.concat("saw "))
//
//    val randSentArray = randSent.toArray
//
//    for(v <- randSentArray) {
//      println(v)
//    }

    def getSum(num1 : Int = 1, num2 : Int = 2) : Int = {
      num1 + num2
    }

    println(" 5 + 4 = " + getSum(5, 4))


    
  }
}
