package comSeven_泛型.测试工具JUnit_;

import org.junit.jupiter.api.Test;

/**
 * @author zq
 */
public class JUnit_ {
    public static void main(String[] args) {
        //传统方法
        new JUnit_().m1();
        new JUnit_().m2();
    }

    @Test
    public void m1(){
        System.out.println("m1被调用");
    }
    @Test
    public void m2(){
        System.out.println("m2被调用");
    }
}
