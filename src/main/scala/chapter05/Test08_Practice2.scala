package chapter05

object Test08_Practice2 {
  def main(args: Array[String]): Unit = {
    // 1.定义一个匿名函数，并将它作为值赋给变量fun。函数有三个参数，类型分别为Int,String,Char,返回值类型为Boolean
    // 要求调用函数fun(0,"",'0')得到返回值为false,其他情况返回true
    val fun = (i: Int,str: String,c: Char)=> {
      if(i == 0 && "" == str && '0' == c) false
      else true
    }
    println(fun(0, "", '0'))

    // 2.定义一个函数func,它接收一个Int类型的参数，返回一个函数（记作f1)
    // 它返回的函数f1,接收一个String类型的参数，同样返回一个函数(记作f2)。
    // 函数f2接收一个Char类型的参数，返回一个Boolean的值。
    // 要求调用函数func(0)("")('0)得到返回值为false,其它情况均返回true
    def func(i: Int): String=>(Char =>Boolean) ={
      def f1(str: String):Char =>Boolean = {
        def f2(c: Char):Boolean ={
          if(i == 0 && "" == str && '0' == c) false else true
        }
        f2
      }
      f1
    }
    println(func(0)("")('0'))

    // 匿名函数简化
    def func1(i: Int): String=>(Char =>Boolean) ={
      str =>c =>if(i == 0 && "" == str && '0' == c) false else true

    }
    println(func1(0)("")('0'))

    // 柯里化
    def func2(i: Int)(str: String)(c: Char):Boolean = if(i == 0 && "" == str && '0' == c) false else true
    println(func2(0)("")('0'))

  }

}
