package chapter07

object Test13_SimpleFunction {
  def main(args: Array[String]): Unit = {
    val list1 = List(12,23,7,8,9)
    val list2 = List(("a",12),("b",23),("c",7),("d",8),("e",9))

    // 1.求和
    println(list1.sum)

    // 2.求乘积
    println(list1.product)

    //3.最大值
    println(list1.max)
    println(list2.maxBy((tuple: (String, Int)) => tuple._2))
    println(list2.maxBy(_._2))

    // 4.最小值
    println(list1.min)

    // 5.排序(默认从小到大）
    println(list1.sorted)

    // 从大到小
    println(list1.sorted.reverse)
    // 传入隐式参数
    println(list1.sorted(Ordering[Int].reverse))

    println(list2.sortBy(_._2)(Ordering[Int].reverse))
  }

}
