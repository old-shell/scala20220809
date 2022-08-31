package chapter07

import scala.collection.mutable.ListBuffer

object Test05_ListBuffer {
  def main(args: Array[String]): Unit = {
    // 1.创建可变列表
    val list1 = new ListBuffer[Int]()
    val list2 = ListBuffer(12,53,75)
    println(list1)
    println(list2)

    // 2.添加元素
    list1.append(12,23)
    list2.prepend(1,2,6)
    list1.insert(1,2,9)
    println(list1)
    println(list2)

    31 +=: 96 +=: list1 += 25 += 12
    println(list1)

    //3.合并List
    val list3 = list1 ++ list2
    println(list3)

    list1 ++= list2 // 将list2加到list1中
    println(list1)

    list1 ++=: list2 // 将List1加到list2中
    println(list2)

    // 4.修改元素
    list1(3) = 200
    println(list2)

    // 5.删除元素
    list2.remove(3) // 删除指定位置元素
    list2 -= 2  // 删除左边第一个值为2的元素
    println(list2)
  }

}
