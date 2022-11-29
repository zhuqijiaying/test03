package comEight多线程基础.threaduse;

/**
 * @author zq
 */
public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        //创建一个cat对象，可以当成线程使用
        Cat cat = new Cat();
        cat.start();//启动线程->最终执行cat的run方法
        //cat.run();//就是一个普通的方法，没有启动线程,会先执行完run方法，才会继续执行下面代码
        System.out.println("主线程继续执行"+Thread.currentThread().getName());
        for (int i = 0;i<60;i++){
            System.out.println("主线程"+i);
            Thread.sleep(1000);
        }
    }
}
//1.当一个类继承了Thread类，该类就可以当线程使用
//2.重写Thread里的run方法，写上自己的业务代码
//3.run Thread 类 实现了 Runnable接口的run方法
class Cat extends Thread{
    int times = 0;
    @Override
    public void run() {
        while (true){
            times+=1;
            System.out.println("喵喵，我是小猫咪"+times);
            //让该线程休眠一秒

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(times == 80){
                break;
            }
        }

    }
}