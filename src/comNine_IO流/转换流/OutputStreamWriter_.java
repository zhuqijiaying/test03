package comNine_IO流.转换流;

import java.io.*;

/**
 * @author zq
 * 演示OutputStreamWriter使用
 * 把FileOutputStream字节流，转换字符流OutputStreamWriter
 * 指定编码
 */
public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "D:\\hello.txt";
        String charset = "utf-8";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath),charset);
        osw.write("hi,韩顺平教育t");
        osw.close();
        System.out.println("按照 "+charset+"保存文件成功");
    }
}
