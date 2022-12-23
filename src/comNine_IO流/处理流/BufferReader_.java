package comNine_IO流.处理流;

/**
 * @author zq
 */
//处理流/包装流
public class BufferReader_ extends Reader_{
    private Reader_ reader_;//属性是Reader_类型

    public BufferReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }
    //让文件更加灵活，多次读取文件
    public void readFiles(int num){
        for (int i = 0; i <num ; i++) {
            reader_.readFile();
        }
    }
    //批量处理字符串
    public void readStrings(int num){
        for (int i = 0; i <num ; i++) {
            reader_.readString();
        }
    }
}
