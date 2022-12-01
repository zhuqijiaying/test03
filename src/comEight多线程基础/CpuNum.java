package comEight多线程基础;

/**
 * @author zq
 */
public class CpuNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        //获取CPU有多少核
        int i = runtime.availableProcessors();//availableProcessors可获取的CPU
        System.out.println(i);
    }
}
