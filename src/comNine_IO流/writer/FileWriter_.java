package comNine_IO流.writer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zq
 */
public class FileWriter_ {
    public static void main(String[] args) {
        String filePath = "D:\\note.txt";
        FileWriter fileWriter = null;
        char[] chars = {'a','b','c'};
        try {
            fileWriter = new FileWriter(filePath);
            //1.写入单个字符
            fileWriter.write('H');
            //2.写入指定数组
            fileWriter.write(chars);
            //3.写入指定数组指定部分
            fileWriter.write(chars,0,2);
            //4.写入整个字符串
            fileWriter.write("北京");
            //5.写入字符串的指定部分
            fileWriter.write("北上广深",0,3);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
