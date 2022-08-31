package chapter07

import scala.collection.immutable.Nil

object Test04_List {
  def main(args: Array[String]): Unit = {
    // 1.创建一个List
    val list1 = List(12,32,16)
    val list2 = 17 :: 28 :: 90 :: 21 :: Nil
    println(list1)
    println(list2)
    // 2.访问和遍历
    println(list1(1))
    list1.foreach(println)

    // 3.添加元素
    val list3 = 10 +: list1
    val list4 = list1 :+ 23
    println(list3)
    println(list4)

    // 4.合并列表
    val list5 = list1 ::: list2
    val list6 = list1 ++ list2
    println(list5)
    println(list6)
  }

}
