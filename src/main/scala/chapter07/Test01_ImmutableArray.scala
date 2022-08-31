package chapter07

object Test01_ImmutableArray {
  def main(args: Array[String]): Unit = {
    // 1.创建数组
    val arr = new Array[Int](10)

    // 方式二
    val arr2 = Array(123,342,23,12)

    // 数组遍历
    // 1.for循环
    for(i <- arr2.indices){
      println(arr2(i))
    }
    println("------------------------------")
    // 2.增强for循环
    for(elem <- arr2){
      println(elem)
    }
    println("-------------------------------")
    // 3.迭代器
    val iter = arr2.iterator
    while (iter.hasNext){
      println(iter.next())
    }
    println("-------------------------------")
    // 4.调用foreach方法
    arr2.foreach(println)
    println("-------------------------------")
    // 5.转成字符串打印
    println(arr2.mkString(","))

    // 添加元素
    val newArr1 = arr2.:+(21)  // 后加
    val newArr11 = arr2 :+ 15  // 后加
    val newArr2 = arr2.+:(45) // 前加
    val newArr22 = 19 +: 29 +: arr2 // 前加
    println(newArr1.mkString(","))
    println(newArr2.mkString(","))
    println(newArr11.mkString(","))
    println(newArr22.mkString(","))
  }

}
