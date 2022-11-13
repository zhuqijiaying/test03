package comFive_常用类.StringBuffer类;

public class StringVSStringBuffer {
    public static void main(String[] args) {
        //String -> StringBuffer
        String str = "hello tom";
        //方式1 使用构造器
        //注意：返回的才是StringBuffer对象，对str没有影响
        StringBuffer stringBuffer = new StringBuffer(str);
        //方式2 使用append方法
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1= stringBuffer1.append(str);

        //StringBuffer -> String
        StringBuffer stringBuffer2 = new StringBuffer("韩顺平教育");
        //方式1 使用StringBuffer提供的toString方法
        String s = stringBuffer2.toString();
        //方式2 使用构造器
        String s1 = new String(stringBuffer2);
    }
}
