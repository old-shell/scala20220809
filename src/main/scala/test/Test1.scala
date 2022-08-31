package test
import org.apache.flink.api.java.utils.ParameterTool
import org.apache.flink.streaming.api.scala._

object Test1 {
  def main(args: Array[String]): Unit = {
    // 1.创建一个流式执行环境
    val env = StreamExecutionEnvironment.getExecutionEnvironment

    // 2.读取socket文件数据
    //    val lineDataStream = env.socketTextStream("node7",1111)
    // 动态传入参数
    val parameterTool = ParameterTool.fromArgs(args)
    val host = parameterTool.get("host")
    val port = parameterTool.getInt("port")
    val lineDataStream = env.socketTextStream(host, port)

    // 3.对数据集进行转换处理
    val wordAndOne = lineDataStream.flatMap(_.split(" ")).map(word => (word, 1))

    // 4.对单词进行分组
    val wordAndOneGroup = wordAndOne.keyBy(_._1)

    // 5.对分组数据进行sum聚合统计
    val sum = wordAndOneGroup.sum(1)

    // 6.打印输出
    sum.print()

    // 执行任务
    env.execute("Test1")
  }

}
