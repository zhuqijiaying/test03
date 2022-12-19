package comNine_IO流.homework;

import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zq
 */

public class Homework01 {
    public static void main(String[] args) {

    }
    @Test
    public void m1() throws IOException {
        String directoryPath = "D:\\myTemp";
        File file = new File(directoryPath);
        if(!(file.exists())){
            file.mkdir();
        }else{
            System.out.println("文件已存在");
        }

        String filePath = directoryPath+"\\hello.txt";
        File file1 = new File(filePath);
        if(!(file1.exists())){
            file1.createNewFile();
            System.out.println("创建成功");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));
            bufferedWriter.write("hello,world");
            bufferedWriter.close();

        }else{
            System.out.println("文件已存在");
        }
    }

}
