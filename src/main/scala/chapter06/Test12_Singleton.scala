package chapter06

object Test12_Singleton {
  def main(args: Array[String]): Unit = {
    val stu1 = Student12.getInstance()
    val stu2 = Student12.getInstance()
    println(stu1 == stu2)
  }

}
// 定义类
class Student12 private(val name: String, val age: Int){
  def printInfo(): Unit ={
    println(s"student: name = $name, age = $age, school = ${Student11.school}")
  }
}

// 饿汉式
//object Student12 {
//  private val student: Student12 = new Student12("alice",18)
//  def getInstance(): Student12 = student
//}

// 懒汉式
object Student12 {
  private var student: Student12 = _
  def getInstance(): Student12 = {
    if(student == null){
      // 如果没有对象实例的话，就创建一个
      student = new Student12("bob",12)
    }
    student
  }
}