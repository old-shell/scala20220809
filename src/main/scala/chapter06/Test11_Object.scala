package chapter06

object Test11_Object {
  def main(args: Array[String]): Unit = {
    val stu1 = Student11.newStudent("a",19)
    val stu2 = Student11("aa",12)
  }

}
// 定义类
class Student11 private(val name: String, val age: Int){
  def printInfo(): Unit ={
    println(s"student: name = $name, age = $age, school = ${Student11.school}")
  }
}

// 伴生对象
object Student11{
  val school: String = "hbi"

  // 定义一个类的对象实例的创建方法
  def newStudent(name: String,age: Int): Student11 = new Student11(name,age)

  def apply(name: String,age: Int): Student11 = new Student11(name,age)

}
