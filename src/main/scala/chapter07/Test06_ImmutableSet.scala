package chapter07

object Test06_ImmutableSet {
  def main(args: Array[String]): Unit = {
    // 1.创建Set
    val set1 = Set(12,34,5,56,2)
    println(set1)

    // 2.添加元素
    val set2 = set1 + 20
    println(set2)

    // 3.合并set
    val set3 = Set(19,20,498)
    val set4 = set2 ++ set3
    println(set4)

    // 4.删除元素
    val set5 = set4 - 34
    println(set5)
  }

}
