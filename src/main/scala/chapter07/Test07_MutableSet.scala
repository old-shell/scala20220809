package chapter07

import scala.collection.mutable

object Test07_MutableSet {
  def main(args: Array[String]): Unit = {
    // 1.创建set
    val set1 = mutable.Set(12,45,23,65)
    println(set1)

    // 2.添加元素
    set1 += 21
    println(set1)
    set1.add(100)
    println(set1)

    // 3.删除元素
    set1 -= 100
    println(set1)
    set1.remove(12)
    println(set1)

    // 4.合并set
    val set2 = mutable.Set(100,200,200)
    set1 ++= set2
    println(set1)
    set2 ++= set1
    println(set2)
  }

}
