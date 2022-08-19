package chapter05

object Test07_Practice {
  def main(args: Array[String]): Unit = {
    val arr: Array[Int] = Array(12,13,12,10)
    // 对数组进行处理，将操作抽象出来，处理完毕之后的结果返回一个新的数组
    def arrayOperation(array: Array[Int],op: Int=>Int):Array[Int] = {
      for(elem <- array) yield op(elem)
    }
    // 定义一个元素翻倍函数
    def double(elem: Int):Int = {
      elem * 2
    }

    val newArr = arrayOperation(arr,double)
    println(newArr.mkString(","))

    // 传入匿名函数，实现元素翻倍
    val newArr2 = arrayOperation(arr,_ * 2)
    println(newArr2.mkString(","))

  }

}
