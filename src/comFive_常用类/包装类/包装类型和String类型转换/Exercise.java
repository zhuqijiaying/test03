package comFive_常用类.包装类.包装类型和String类型转换;

public class Exercise {
    public static void main(String[] args) {
        Integer integer1 = new Integer(1);
        Integer integer2 = new Integer(1);
        System.out.println(integer1==integer2);//false，因为是new的对象
        System.out.println(integer1.equals(integer2));

        //底层源码看范围（-128~127），其余范围相当于new Integer（XXX）
        Integer m = 1;
        Integer n = 1;
        System.out.println(m==n);
        Integer x = 128;
        Integer y = 128;
        System.out.println(x==y);

        //只要有基本数据类型，就是判断值是否相等
        Integer i1 = 127;
        int i2 = 127;
        System.out.println(i1==i2);//true

        Integer i3 = 128;
        double i4 = 128;
        System.out.println(i3==i4);//true
    }
}
