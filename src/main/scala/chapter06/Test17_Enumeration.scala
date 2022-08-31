package chapter06

import java.lang.reflect.Type

object Test17_Enumeration {
  def main(args: Array[String]): Unit = {
    println(WorkDay.MONDAY)
  }
}

// 定义枚举类对象
object WorkDay extends Enumeration {
  val MONDAY = Value(1,"Monday")
  val TUESDAY = Value(2,"Tuesday")
}

// 定义应用类对象:可直接执行，不用main方法
object TestApp extends App{
  println("app start")

  // type自定义新类型
  type MyType = String
  val a: MyType = "aaa"
}