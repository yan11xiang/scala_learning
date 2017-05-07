package scala

/**
  * @author CBrother
  * @since 2017/5/7
  */
object ScalaTest {

  def main(args: Array[String]) {

    //字符串的处理
    var randSent = "I saw a dragon fly by"

    println("String length :" + randSent.length)
    println(randSent.concat("saw "))
    val randSentArray = randSent.toArray
    //for循环
    for(v <- randSentArray) {
      println(v)
    }

    //构建方法 def 方法名(参数名 : 参数类型 = 默认参数值, ...) : 返回值（Unit = Java中的void） = { 方法体}
    def getSum(num1 : Int = 1, num2 : Int = 2) : Int = {
      num1 + num2
    }
    println(" 5 + 4 = " + getSum(5, 4))

    //var 隐式转换， 实际类型为 ScalaClassTest
    var a = new ScalaClassTest()
    // 调用Java类库
    System.out.print(a.test())

  }
}
