package comNine_IO流.处理流1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author zq
 */
//演示使用BufferedOutputStream和BufferedInputStream
public class BufferedCopy02 {
    public static void main(String[] args) throws Exception{
        String srcFilePath = "D:\\1.png";
        String destFilePath = "D:\\3.png";
        //创建BufferedOutputStream对象BufferedInputStream对象
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(srcFilePath));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destFilePath));
        //循环读取文件，并写入到destFilePath
        byte[] bytes = new byte[1024];
        int readLen = 0;
        //当返回-1时就表示文件读取完毕
        while ((readLen = bufferedInputStream.read(bytes))!=-1){
            bufferedOutputStream.write(bytes,0,readLen);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
