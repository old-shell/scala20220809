package chapter07

object Test12_DrivedCollection {
  def main(args: Array[String]): Unit = {
    val list1 = List(12,3,23,12,78)
    val list2 = List(12,67,3,78,9,6)
    // 1.获取集合的头
    println(list1.head)

    // 2.获取集合的尾（不是头的就是尾)
    println(list1.tail)

    // 3.集合最后一个数据
    println(list1.last)

    // 4.集合初始数据(不包含最后一个）
    println(list1.init)

    // 5.反转
    println(list1.reverse)

    // 6.取前(后) n 个元素
    println(list1.take(3))
    println(list1.takeRight(3))

    // 7.去掉前(后) n 个元素
    println(list1.drop(3))
    println(list1.dropRight(3))

    // 8.并集(set做并集会去重，list不会）
    val union = list1.union(list2)
    println("union:" + union)
    println(list1 ::: list2)

    // 9.交集
    val intersection = list1.intersect(list2)
    println("intersection: " + intersection)

    // 10.差集
    val diff1 = list1.diff(list2) // list1中不同的元素
    val diff2 = list2.diff(list1) // list2中不同的元素

    // 11.拉链
    println("zip: " + list1.zip(list2))

    // 12.滑窗
    for (elem <- list1.sliding(3))
      println(elem)

    for (elem <- list2.sliding(4,2)) println(elem)


  }

}
