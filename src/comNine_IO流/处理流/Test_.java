package comNine_IO流.处理流;

/**
 * @author zq
 */
public class Test_ {
    public static void main(String[] args) {
        BufferReader_ bufferReader_ = new BufferReader_(new FileReader_());
        bufferReader_.readFiles(10);
        BufferReader_ bufferReader_1 = new BufferReader_(new StringReader_());
        bufferReader_1.readStrings(5);
    }
}
