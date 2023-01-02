package comTen_reflection.reflection_;

import comTen_reflection.reflectionQuestion1.Cat;

import java.lang.reflect.Method;

/**
 * @author zq
 * 测试反射调用的性能，和优化方案
 */
public class reflection02 {
    public static void main(String[] args) throws Exception {
        m1();
        m2();
    }
    public static void m1(){
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for(int i = 0 ; i < 900000000; i++){
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("传统方法调用hi耗时"+(end-start));
    }
    public static void m2() throws Exception {
        Class<?> aClass = Class.forName("comTen_reflection.reflectionQuestion1.Cat");
        Object o = aClass.newInstance();
        Method hi = aClass.getMethod("hi");
        long start = System.currentTimeMillis();
        for(int i = 0 ; i < 900000000; i++){
            hi.invoke(o);//反射调用方法
        }
        long end = System.currentTimeMillis();
        System.out.println("反射调用hi耗时"+(end-start));
    }
}
