package comNine_IO流.file;

import org.junit.Test;
//import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author zq
 */
public class FileCreate {
    public static void main(String[] args) {

    }
    //方式1
    @Test
    public void create01(){
        String filePath = "D:\\news1.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //方式2
    @Test
    public void create02(){
        File parentFile = new File("D:\\");
        String fileName = "new2.txt";
        File file = new File(parentFile, fileName);
        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //方式3
    @Test
    public void create03(){
        String parentPath="D:\\";
        String fileName="news3.txt";
        File file = new File(parentPath, fileName);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
