package chapter05

object Test06_HighOrderFunction {
  def main(args: Array[String]): Unit = {
    def f(n: Int): Int = {
      println("f调用")
      n+1
    }

    val result = f(123)
    println(result)

    // 1.函数作为值进行传递
    val f1: Int=>Int = f
    val f2 = f _

    // 2.函数作为参数进行传递
    // 定义二元计算函数
    def dualEval(op: (Int,Int) => Int, a: Int, b: Int): Int = {
      op(a,b)
    }

    def add(a: Int,b: Int): Int = {
      a + b
    }
    println(dualEval(add,12,12))
    println(dualEval((a,b) => a + b,14,12))
    println(dualEval(_ + _,12,12))

    // 3.函数作为函数的返回值返回
    def f5(): Int=>Int = {
      def f6(a: Int): Int = {
        println("f6调用 " + a)
        a
      }
      f6
    }
    println(f5()(32))

  }

}
