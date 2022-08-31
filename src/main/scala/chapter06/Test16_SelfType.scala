package chapter06

object Test16_SelfType {
  def main(args: Array[String]): Unit = {
    val user = new RegisterUser("alice","23424")
    user.insert()
  }

}
class User(val name: String, val password: String)

trait UserDao{
  // 注入User类
  _: User =>

  // 向数据库插入数据
  def insert(): Unit = {
    println(s"insert into db: ${this.name},${this.password}")
  }
}
// 定义注册用户类
class RegisterUser(name: String, password: String) extends User(name,password) with UserDao