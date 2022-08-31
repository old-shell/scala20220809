package chapter07

import scala.collection.mutable

object Test09_Mutable {
  def main(args: Array[String]): Unit = {
    // 1.创建map
    val map1 = mutable.Map("a" -> 120, "b" -> 110, "hello" -> 200)
    println(map1)

    // 2.添加元素
    map1.put("c",30)
    println(map1)
    map1 += (("d",40))
    println(map1)

    // 3.删除元素
    map1.remove("c")
    map1 -= "d"
    println(map1)

    // 4.修改元素
    map1.update("c",10)
    map1.update("a",130)
    println(map1)

    // 5.合并两个Map
    val map2 = mutable.Map("aaa" -> 1, "b" -> 2, "hello" -> 6)
    map1 ++= map2 // 将map中元素添加到map1中，如果存在相同元素，覆盖map1中已存在的元素
    println(map1)
  }

}
