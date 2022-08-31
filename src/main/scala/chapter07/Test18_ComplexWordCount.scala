package chapter07

object Test18_ComplexWordCount {
  def main(args: Array[String]): Unit = {
    val tupleList: List[(String,Int)] = List(
      ("hello",1),
      ("hello world",2),
      ("hello scala",3),
      ("hello spark from scala",1),
      ("hello flink from scala",2)
    )

    // 思路1：直接展开为普通版本
    val newStringList: List[String] = tupleList.map(
      kv => {
        (kv._1.trim + " ") * kv._2
      }
    )

    // 接下来操作与普通版本完全一致
    val wordCountList: List[(String,Int)] = newStringList
      .flatMap(_.split(" "))
      .groupBy(word => word)
      .map(kv => (kv._1, kv._2.size))
      .toList
      .sortBy(_._2)(Ordering[Int].reverse)
      .take(3)

    println(wordCountList)

    // 思路2：直接基于与统计的结果进行转换
    // 1.将字符串打散为单词，并结合对应的个数包装成元组
    val preCountList = tupleList.flatMap(tuple => {
      val strings = tuple._1.split(" ")
      strings.map(word => (word, tuple._2))
    })
    // 2.对二元组按照单词进行分组
    val preCountMap: Map[String, List[(String, Int)]] = preCountList.groupBy(_._1)

    // 3.叠加每个单词与统计的个数值
    val countMap = preCountMap.mapValues(tupleList => tupleList.map(_._2).sum)

    // 4.转换成list,排序取前三
    val countList = countMap.toList
      .sortWith(_._2 > _._2)
      .take(3)

    println(countList)

  }

}
