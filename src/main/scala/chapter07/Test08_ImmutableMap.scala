package chapter07

object Test08_ImmutableMap {
  def main(args: Array[String]): Unit = {
    // 1.创建map
    val map1: Map[String, Int] = Map("a" -> 12, "b" -> 21, "hello" -> 200)
    println(map1)
    println(map1.getClass)

    // 2.遍历元素
    map1.foreach(println)
    map1.foreach((kv: (String, Int)) => println(kv))

    // 3.取 map 中所有的 key 或者 value
    for(key <- map1.keys){
      println(s"$key ---> ${map1.get(key)}")
    }

    // 4.访问某一个 key 的 value
    println("a: " + map1.getOrElse("a",0))
  }

}
