package comNine_IO流.outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author zq
 */
public class FileCopy {
    public static void main(String[] args) {
        //完成文件拷贝，将D:\\1.png拷贝到C:\\
        String filePath = "D:\\1.png";
        String filePath1 = "D:\\7.png";
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(filePath);
            fileOutputStream = new FileOutputStream(filePath1);

            //定义一个字节数组，提高读取效果
            byte[] buf = new byte[1024];
            int realLen = 0;
            while((realLen = fileInputStream.read(buf))!=-1){
                fileOutputStream.write(buf,0,realLen);
            }
            System.out.println("拷贝成功");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fileInputStream!=null){
                    fileInputStream.close();
                }
                if(fileOutputStream!=null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
