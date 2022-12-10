package comNine_IO流.file;

import org.junit.Test;
//import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author zq
 */
public class Directory_ {
    public static void main(String[] args) {
        //
    }
    @Test
    public void m1(){
        String filePath = "D:\\news1.txt";
        File file = new File(filePath);
        if(file.exists()){
            file.delete();
            System.out.println("删除成功");
        }else{
            System.out.println("该文件不存在");
        }

    }
    //在java编程中，目录也被当成一个文件
    @Test
    public void m2(){
        String filePath = "D:\\demo2";
        File file = new File(filePath);
        if(file.exists()){
            file.delete();
            System.out.println("删除成功");
        }else{
            System.out.println("该目录不存在");
        }

    }
    //判断D:demo2\\a\\b\\c是否存在，存在提示，不存在创建
    @Test
    public void m3(){
        String directoryPath = "D:\\demo2\\a\\b\\c";
        File file = new File(directoryPath);
        if(file.exists()){
            System.out.println("目录存在");
        }else{
            if(file.mkdirs()){
                System.out.println("创建成功");
            }else{
                System.out.println("创建失败");
            }
        }

    }
}
