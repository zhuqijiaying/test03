package comNine_IO流.处理流1;

import java.io.*;

/**
 * @author zq
 */
public class BufferedCopy_ {
    public static void main(String[] args) throws Exception {
        String srcFilePath = "D:\\hello.txt";
        String destFilePath = "D:\\hello1.txt";
        String line;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(srcFilePath));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destFilePath));
        while((line=bufferedReader.readLine())!=null){
            bufferedWriter.write(line);
            bufferedWriter.newLine();//换行
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
