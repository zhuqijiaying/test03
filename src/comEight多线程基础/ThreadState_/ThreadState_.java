package comEight多线程基础.ThreadState_;

/**
 * @author zq
 */
/*
线程7大状态：
1.NEW
尚未启动的线程处于此状态。
2.RUNNABLE
在Java虚拟机中执行的线程处于此状态。 这里分Ready和Running两种状态
3.BLOCKED
被阻塞等待监视器锁定的线程处于此状态。
4.WAITING
正在等待另一个线程执行特定动作的线程处于此状态。
5.TIMED_WAITING
正在等待另一个线程执行动作达到指定等待时间的线程处于此状态。
6.TERMINATED
已退出的线程处于此状态
 */

public class ThreadState_ {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        System.out.println(t.getName()+"状态"+t.getState());
        t.start();
        while (Thread.State.TERMINATED != t.getState()){
            System.out.println(t.getName()+"状态"+t.getState());
            Thread.sleep(500);
        }
        System.out.println(t.getName()+"状态"+t.getState());
    }
}
class T extends Thread{
    @Override
    public void run() {
        while (true){
            for (int i=0;i<10;i++){
                System.out.println("hi"+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            break;
        }
    }
}