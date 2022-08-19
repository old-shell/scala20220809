package chapter05

object Test09_CloureAndCurrying {
  def main(args: Array[String]): Unit = {
    def add(a: Int, b: Int): Int = {
      a + b
    }

    // 1.考虑固定一个加数的场景
    def addByFour(b: Int): Int = {
      4 + b
    }

    // 2.扩展固定参数改变的情况
    def addByFive(b: Int): Int = {
      5 + b
    }

    // 3.将固定加数作为另一个参数传入，但是是作为"第一层参数"传入
    def addByFour1(): Int =>Int = {
      val a = 4
      def addB(b: Int): Int = {
        a + b
      }
      addB
    }

    // 简化: 将a作为参数
    def addByA(a: Int): Int =>Int = {
      def addB(b: Int): Int = {
        a + b
      }
      addB
    }

    // 简化:改成匿名函数
    def addByA1(a: Int): Int =>Int = {
      (b: Int) => {
        a + b
      }
    }

    // 简化: 省略参数类型，方法体只有一行去中括号，参数只出现一次用_代替
    def addByA2(a: Int): Int =>Int = a + _
    println(addByA2(21)(12))

    // 先固定第一个参数，再给第二个多变参数赋值
    val addByTwo = addByA2(2)
    println(addByTwo(23))
    println(addByTwo(123))

    // 柯里化
    def addCurrying(a: Int)(b: Int): Int = {
      a + b
    }
    val addA: Int=>Int = addCurrying(2)
    println(addA(1000))
    println(addCurrying(12)(50))


  }

}
