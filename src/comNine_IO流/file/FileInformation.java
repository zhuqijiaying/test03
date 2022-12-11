package comNine_IO流.file;

import org.junit.Test;
//import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author zq
 */
public class FileInformation {
    public static void main(String[] args) {

    }
    //获取文件信息
    @Test
    public void info(){
        File file = new File("D:\\new1.txt");
        //getName名字
        System.out.println("文件名字"+file.getName());
        // getAbsolutePath路径
        System.out.println("文件绝对路径"+file.getAbsolutePath());
        // getParent父级目录
        System.out.println("得到文件父级目录"+file.getParent());
        // length文件大小
        System.out.println("文件大小"+file.length());
        // exists是否存在
        System.out.println("查看文件是否存在"+file.exists());
        // isFile是不是文件
        System.out.println("查看是否是文件"+file.isFile());
        // isDirectory是不是目录
        System.out.println("查看是否是目录"+file.isDirectory());

    }
}
