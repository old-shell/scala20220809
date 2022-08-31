package chapter07

import scala.collection.mutable.ArrayBuffer

object Test02_MutableArray {
  def main(args: Array[String]): Unit = {
    // 1.创建可变数组
    val arr1 = new ArrayBuffer[Int]()
    val arr2 = ArrayBuffer(12,32,12,12)

    // 添加元素
    arr1 += 13 // 后加
    77 +=: arr1 // 前加
    println(arr1)

    arr1.append(23) // 后加
    arr1.prepend(11,76) // 前加
    arr1.insert(1,13,59) // 指定位置加

    arr1.insertAll(2,arr2) // 指定位置添加数组
    arr1.appendAll(arr2) // 后加数组
    arr1.prependAll(arr2) // 前加数组
    println(arr1)

    // 删除元素
    arr1.remove(2) // 删除指定索引元素
    arr1.remove(0,3) // 指定索引开始，连续删除n个元素
    arr1 -= 13 // 删除一个数组中的指定值
    println(arr1)

    // 可变数组转换为不可变数组
    val arr: ArrayBuffer[Int] = ArrayBuffer(12,34,47)
    val newArr: Array[Int] = arr.toArray
    println(newArr)
    println(arr)

    // 不可变数组转换为可变数组
    val buffer = newArr.toBuffer
    println(buffer)

  }

}
