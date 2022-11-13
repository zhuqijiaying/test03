package comFive_常用类.StringBuffer类;

public class StringBuffer02 {
    public static void main(String[] args) {
        //1.创建一个大小为16的char[],勇于存放字符内容
        StringBuffer stringBuffer = new StringBuffer();
        //2.通过构造器指定构造器大小
        StringBuffer stringBuffer1 = new StringBuffer(100);
        //3.通过给一个String创建StringBuffer，char[]大小就是str.length()+16
        StringBuffer stringBuffer2 = new StringBuffer("hello");
    }
}
