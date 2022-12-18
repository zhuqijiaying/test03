package comNine_IO流.转换流;

import java.io.*;

/**
 * @author zq
 */
//演示使用InputStreamReader转换流解决中文乱码问题
    //将字节流FileInputStream转成字符流InputStreamReader，指定编码
public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        String filePath = "D:\\hello1.txt";
        //把FileInputStream转成InputStreamReader，同时指定了编码
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "utf-8");
        //把InputStreamReader传入BufferedReader
        BufferedReader reader = new BufferedReader(isr);
        //读取
        String s = reader.readLine();
        System.out.println(s);
        //关流
        reader.close();
    }
}
