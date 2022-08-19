package chapter02

import chapter01.Student

object Test07_DataType {
  def main(args: Array[String]): Unit = {
    // 1.整数类型
    val a1: Byte = 127
    val a2: Byte = -128

    val a3 = 12 // 整数默认类型为Int
    val a4 = 1232453656L

    val b1: Byte = 10
    val b2: Byte = (10 + 20) // 可以
    println(b2)

//    val b3: Byte = b1 + 20  // 不可以
    val b3:Byte = (b1+20).toByte
    println(b3)

    // 2.浮点类型
    val f1: Float = 1.2345f
    val d1 = 34.2232

    // 3.字符类型
    val c1: Char = 'a'
    println(c1)

    val c2: Char = '9'
    println(c2)

    // 控制类型
    val c3: Char = '\t'
    val c4: Char = '\n'
    println("abc"+c3+"def")
    println("abc"+c4+"def")

    // 转移字符
    val c5 = '\\'
    val c6 = '\"'
    println(c5)
    println(c6)

    // 字符变量底层保存ASCII码
    val i1: Int = c1
    println("i1"+ i1)
    val i2: Int = c2
    println("i2:" + i2)

    val c7: Char = (i1 + 1).toChar
    println(c7)

    val c8: Char = (i2 -1).toChar
    println(c8)

    // 4.布尔类型
    val isTrue: Boolean = true
    println(isTrue)

    // 5.空类型
    // 5.1 空值Unit
    def m1():Unit = {
      println("m1被调用执行")
    }

    val a = m1()
    println(a)

    // 5.2 空引用Null
    var student: Student = new Student("alice",20)
    student = null
    println(student)

    // 5.2 Nothing
    def m2(n: Int):Nothing = {
      throw  new NullPointerException
    }

    val b = m2(0)



  }

}
