package chapter07

object Test10_Tuple {
  def main(args: Array[String]): Unit = {
    // 1.创建元组
    val tuple: (String, Int, Char, Boolean) = ("hello",100,'a',true)
    println(tuple)

    // 2.访问数据
    println(tuple._1)
    println(tuple.productElement(2))

    // 3.遍历元组数据
    for (elem <- tuple.productIterator){
      println(elem)
    }

    // 4.嵌套元组
    val mulTuple = (12,1,"hello",(32,"tuple"),90)
    println(mulTuple._4._2)
  }

}
