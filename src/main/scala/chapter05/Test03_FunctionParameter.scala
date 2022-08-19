package chapter05

object Test03_FunctionParameter {
  def main(args: Array[String]): Unit = {
//    1.可变参数
    def f1(str: String*): Unit = {
      println(str)
    }

    f1("aaa","bbb","ccc")
    println("=======================")

//    2.如果参数列表中存在多个参数，那么可变参数一般放置在最后
    def f2(str1: String,str2:String*):Unit = {
      println("str1: " + str1 + " str2: " + str2)
    }
    f2("dddd","ffff")
    println("===============================")
//    3.参数默认值，一般将有默认值的参数防止在参数列表的后面
    def f3(name: String = "hhhh"): Unit = {
      println(name)
    }
    f3("123")
    println("======================")

//    4.带参数
    def f4(name: String = "hhhhhhhhhhhh",age: Int): Unit = {
      println(age + name)
    }
    f4(age = 3)
  }

}
