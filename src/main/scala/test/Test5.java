package test;

import org.apache.flink.api.java.utils.ParameterTool;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class Test5 {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        env.setParallelism(1);
        // 2.读取socket文件数据
        ParameterTool parameterTool = ParameterTool.fromArgs(args);
        String host = parameterTool.get("host");
        int port = parameterTool.getInt("port");
        DataStreamSource<String> lineDataStream = env.socketTextStream(host, port);

        // 3.对数据集进行转换处理
        lineDataStream.print();

        try {
            env.execute("Test5");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
