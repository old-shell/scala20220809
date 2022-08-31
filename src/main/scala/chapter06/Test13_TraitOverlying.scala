package chapter06

object Test13_TraitOverlying {
  def main(args: Array[String]): Unit = {
    val ball = new MyBall
    println(ball.describe()) //my ball is a color-category-Ball
  }
}

trait Ball {
  def describe(): String = "Ball"
}

trait ColorBall extends Ball {
  override def describe(): String = "color-" + super.describe()
}

trait CategoryBall extends Ball {
  override def describe(): String = "category-" + super.describe()
}

class MyBall extends CategoryBall with ColorBall {
  override def describe(): String = "my ball is a " + super[CategoryBall].describe()
}