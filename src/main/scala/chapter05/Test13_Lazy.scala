package chapter05

object Test13_Lazy {
  def main(args: Array[String]): Unit = {
    lazy val result: Int = sum(12,21)

    println("1.函数调用")
    println("2.result = " + result)
  }

  def sum(a: Int, b: Int): Int = {
    println("3.sum调用")
    a + b
  }
}
