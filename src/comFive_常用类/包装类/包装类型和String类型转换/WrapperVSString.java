package comFive_常用类.包装类.包装类型和String类型转换;

public class WrapperVSString {
    public static void main(String[] args) {
        //包装类转String类
        Integer i =100;
        //方式1
        String str1 = i+"";
        //方式2
        String str2 = i.toString();
        //方式3
        String str3 = String.valueOf(i);
        //String ->包装类(Integer)
        String str4 = "12345";
        Integer i1 = Integer.parseInt(str4);
        Integer i2 = new Integer(str4);
    }
}
