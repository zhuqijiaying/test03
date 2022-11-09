package comFive_常用类.包装类.装箱与拆箱;

public class Integer01 {
    public static void main(String[] args) {
        //演示int<-->Integer的装箱与拆箱
        //jdk5之前手动装箱与拆箱
        int n1 =100;
        Integer integer = new Integer(n1);//手动装箱
        int i = integer.intValue();//手动拆箱

        //自动装箱与拆箱
        int n2 =200;
        Integer integer1 = n2;//自动装箱
        int n3 = integer1;//自动拆箱
    }
}
