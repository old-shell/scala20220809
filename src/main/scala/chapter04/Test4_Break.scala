package chapter04

import scala.util.control.Breaks

object Test4_Break {
  def main(args: Array[String]): Unit = {

    Breaks.breakable(
      for(i <- 0 until 5){
        if(i == 3)
          Breaks.break()
        println(i)
      }
    )
  }

}
