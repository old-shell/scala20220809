package chapter01

class Student(name: String, age: Int) {
  def printInfo():Unit = {
    println(name + " " + age + " " + Student.school)
  }


}
// 引入半生对象
object Student{
  val school: String = "atguigu"

  def main(args: Array[String]): Unit = {
    val p1 = new Student("aa",18)
    p1.printInfo
    
  }
}
