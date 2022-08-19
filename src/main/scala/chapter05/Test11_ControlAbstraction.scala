package chapter05

object Test11_ControlAbstraction {
  def main(args: Array[String]): Unit = {

    // 1.传值参数
    def f0(a: Int): Unit = {
      println("a: " + a)
      println("a: " + a)
    }

    f0(23)

    def f1(): Int = {
      println("f1调用")
      12
    }
    f0(f1())

    println("========================")
    // 2.传名参数，传递的不再是具体的值，而是代码块
    def f2(a: =>Int): Unit = {
      println("aa:" + a)
      println("aa:" + a)
    }

    f2(23)
    f2(f1())

    f2({
      println("代码块调用")
      120
    })
  }
}
