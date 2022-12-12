package comNine_IO流.打印流;

import java.io.IOException;
import java.io.PrintStream;

/**
 * @author zq
 * 演示PrintStream（字节打印流）
 */
public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
        out.print("hello,join");
        out.write("韩顺平，你好".getBytes());
        out.close();
        System.setOut(new PrintStream("D:\\f1.txt"));//修改打印位置
        System.out.println("hello，韩顺平");
    }
}
