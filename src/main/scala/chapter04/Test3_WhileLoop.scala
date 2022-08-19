package chapter04

object Test3_WhileLoop {
  def main(args: Array[String]): Unit = {
    // while
    var a: Int = 10
    while (a >= 1){
      println("this is a while loop: " + a)
      a -= 1
    }

    println("============================")
    // do while
    var b: Int = 0
    do {
      println("this is a do-while loop: " + b)
      b -= 1
    } while (b > 0)


  }

}
