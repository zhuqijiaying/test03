package comNine_IO流.处理流1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zq
 */
//演示BufferedWriter
public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "D:\\hello.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));
        bufferedWriter.write("明天你好");
        bufferedWriter.close();
    }
}
