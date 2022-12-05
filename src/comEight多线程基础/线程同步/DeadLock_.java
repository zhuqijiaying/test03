package comEight多线程基础.线程同步;

/**
 * @author zq
 */
public class DeadLock_ {
    public static void main(String[] args) {
        DeadLockDemo A = new DeadLockDemo(true);
        A.setName("A线程");
        DeadLockDemo B = new DeadLockDemo(false);
        B.setName("B线程");
        A.start();
        B.start();
    }
}
class DeadLockDemo extends Thread{
    static Object o1 = new Object();//保证多线程，共享一个对象，这里使用static
    static Object o2 = new Object();
    boolean flag;
    public DeadLockDemo(boolean flag){
        this.flag = flag;
    }

    @Override
    public void run() {
        //1.如果flag为true，线程就会得到o1对象锁，然后尝试去获取o2对象锁
        //2.如果线程A得不到o2对象锁，就会blocked
        //3.如果flag为false，线程就会先得到o2对象锁，然后尝试去获取o1对象锁
        //2.如果线程B得不到o1对象锁，就会blocked
        if (flag){
            synchronized (o1){//对象互斥锁，下面是同步代码
                System.out.println(Thread.currentThread().getName()+"进入1");
                synchronized (o2){
                    System.out.println(Thread.currentThread().getName()+"进入2");
                }
            }
        }else {
            synchronized (o2){
                System.out.println(Thread.currentThread().getName()+"进入3");
                synchronized (o1) {
                    System.out.println(Thread.currentThread().getName() + "进入4");
                }
            }
        }
    }
}