package chapter07

import scala.collection.immutable.Queue
import scala.collection.mutable

object Test19_Queue {
  def main(args: Array[String]): Unit = {
    // 创建一个可变队列
    val queue = mutable.Queue[String]()
    queue.enqueue("a","b","c")
    println(queue)
    println(queue.dequeue()) // 返回出队的元素a

    // 创建一个不可变队列
    val queue1 = Queue("a","b","c")
    val queue2: Queue[String] = queue1.enqueue("d")
    println(queue1) // 不可变
    println(queue2)
    val queue3:(String,Queue[String]) = queue1.dequeue  // (a,Queue(b, c))

  }

}
