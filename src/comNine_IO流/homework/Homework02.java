package comNine_IO流.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author zq
 *
 * 使用Bufferedreader读取一个文件，加上行号，输出每一行
 */
public class Homework02 {
    public static void main(String[] args) throws IOException {
        String filePath = "D:\\hello.txt";
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line="";
        int numLine = 0;
        while((line=reader.readLine()) !=null){
            System.out.println(++numLine+"."+line);
        }
        reader.close();
    }
}
