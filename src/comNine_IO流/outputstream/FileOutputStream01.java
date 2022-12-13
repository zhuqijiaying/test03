package comNine_IO流.outputstream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author zq
 */
public class FileOutputStream01 {
    public static void main(String[] args) {

    }
    //演示使用FileOutputStream将数据写到文件中，
    //如果文件不存在，则创建文件
    @Test
    public void writeFile(){
        String filePath = "D:\\a.txt";
        FileOutputStream fileOutputStream = null;
        try {
            //得到FileOutputStream对象
            //1.new FileOutputStream(filePath)创建方式，再次写入，会覆盖原来的内容
            //2.new FileOutputStream(filePath,true)创建方式，再次写入，会添加到末尾
            fileOutputStream = new FileOutputStream(filePath,true);
            //1.写入一个字节
            //fileOutputStream.write('H');
            //2.写入字符串
            String str = "hello,world";
            //fileOutputStream.write(str.getBytes());
            //3可以指定从字符串的位置和长度写入
            fileOutputStream.write(str.getBytes(),0,str.length());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
