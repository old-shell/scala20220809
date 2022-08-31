package chapter07

object Test11_CollectionOp {
  def main(args: Array[String]): Unit = {
    val list = List(12,3,5,634,23)
    val set = Set(43,2,1,90)

    // 1.获取集合长度
    println(list.length)

    // 2.获取集合大小
    println(set.size)

    // 3.循环遍历
    for (elem <- list){
      println(elem)
    }

    println("===============")
    set.foreach(println)

    println("=================")
    // 4.迭代器
    for (elem <- list.iterator) println(elem)

    // 5.生成字符串
    println(list)
    println(set)
    println(list.mkString("--"))

    // 6.是否包含
    println(list.contains(12))
    println(set.contains(12))
  }

}
