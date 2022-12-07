package comNine_IO流.reader;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author zq
 */
public class FileReader_ {
    public static void main(String[] args) {
        String filePath = "D:\\story.txt";
        FileReader fileReader = null;
        int data = ' ';
        //1.创建FileReader对象
        try {
            fileReader = new FileReader(filePath);
            while((data=fileReader.read())!=-1){
                System.out.print((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void readFile01(){
        String filePath = "D:\\story.txt";
        FileReader fileReader = null;
        int data = ' ';
        //1.创建FileReader对象
        try {
            fileReader = new FileReader(filePath);
            while((data=fileReader.read())!=-1){
                System.out.print((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void readFile02(){
        String filePath = "D:\\story.txt";
        FileReader fileReader = null;
        int readLength = 0;
        char[] buf = new char[8];
        //1.创建FileReader对象
        try {
            fileReader = new FileReader(filePath);
            while((readLength=fileReader.read(buf))!=-1){
                System.out.print(new String(buf,0,readLength));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
