package comNine_IO流.打印流;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author zq
 * 演示PrintWriter使用方式
 */
public class PrintWriter_ {
    public static void main(String[] args) throws IOException {
        //PrintWriter printWriter = new PrintWriter(System.out);//显示器输出
        PrintWriter printWriter = new PrintWriter(new FileWriter("D:\\f2.txt"));
        printWriter.print("hi,南昌你好");
        printWriter.close();
    }
}
