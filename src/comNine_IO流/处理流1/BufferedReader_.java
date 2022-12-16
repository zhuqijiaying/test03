package comNine_IO流.处理流1;


import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author zq
 */
//演示bufferReader
public class BufferedReader_ {
    public static void main(String[] args) throws Exception {
        String filePath = "D:\\hello.txt";
        BufferedReader bufferReader = new BufferedReader(new FileReader(filePath));
        //读取
        String line;//按行读取
        while ((line = bufferReader.readLine())!=null){
            System.out.println(line);
        }
        bufferReader.close();
    }
}
