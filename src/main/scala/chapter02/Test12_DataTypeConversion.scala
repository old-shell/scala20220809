package chapter02

object Test12_DataTypeConversion {
  def main(args: Array[String]): Unit = {

    // TODO 1 自动类型转换
//    1. 自动提升原则：有多种类型的数据混合运算时，系统首先自动将所有数据转换成精度大的那种数据类型，然后再进行计算。
    val a1: Byte = 10
    val b1: Long = 2342
    val result1: Long = a1 + b1
    val result11: Int = (a1 + b1.toInt)

//    2. 把把精度小的数值类型赋值给精度大的数值类型，会进行自动类型转换
    val a2: Byte = 10
    val b2: Int = a2
//    val c2: Byte = b2

//    3. (byte, short) 和 char 之间不会相互自动转换
    val a3: Byte = 10
    val b3: Char = 'b'
//    val c3: Byte = b3
//    println(c3)

//    4. byte, short, char 三者可以计算，在计算时首先转换为 int类型
    val a4: Byte = 12
    val b4: Short = 23
    val c4: Char = 'c'
    val result4: Int = a4 + b4
    val result44:Int = a4 + b4 + c4
    println(result4)

    // TODO 2 强制类型转换
//    1. 将数据由高精度转换为低精度，要用强制类型转换
    val n1: Int = -2.9.toInt
    println("n1:" + n1)

//    2. 强转符号只针对于最近的操作数有效，往往会使用小符号提升优先级
    val n2: Int = 2.6.toInt + 3.7.toInt
    val n3: Int = (2.6 + 3.7).toInt
    println("n3:" + n3)

    // TODO 3 数值类型和String类型的转换
    // 1.数值转string
    val n: Int = 23
    val s: String = n + ""
    println(s)
    // 2.string转数值
    val m: Int = "12".toInt
    val f: Float = "12.3".toFloat
    val f2: Int = "12.3".toDouble.toInt
    println(f2)
  }

}
