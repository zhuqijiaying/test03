package comEight多线程基础.线程同步;

/**
 * @author zq
 */
/*
线程同步，即当有一个线程在对内存进行操作的时候，其他线程都不可以对这个内存地址进行操作，直到该线程完成操作，其他线程才能对该内存地址进行操作

注意事项和细节
1.同步方法如果没有使用static修饰：默认锁对象为this
2.如果方法使用static修饰，默认锁对象：当前类.class
3.实现的落地步骤：
需要先分析上锁的代码
选择同步代码块或同步方法
要求多个线程的锁对象为同一个即可！

 */
public class SellTicket {
    public static void main(String[] args) {
//        SellTicket1 sellTicket1 = new SellTicket1();
//        SellTicket1 sellTicket2 = new SellTicket1();
//        SellTicket1 sellTicket3 = new SellTicket1();
//        sellTicket1.start();
//        sellTicket2.start();
//        sellTicket3.start();
//        SellTicket2 sellTicket2 = new SellTicket2();
//        new Thread(sellTicket2).start();
//        new Thread(sellTicket2).start();
//        new Thread(sellTicket2).start();
        SellTicket3 sellTicket3 = new SellTicket3();
        new Thread(sellTicket3).start();
        new Thread(sellTicket3).start();
        new Thread(sellTicket3).start();
    }
}

class SellTicket3 implements Runnable{
    private int ticket1 = 100;
    private boolean loop = true;


    //同步方法(静态的)的锁为当前类本身
//1. public synchronized static void m1() 锁是加在SellTicket03.class
//2.如果在静态方法中，实现一个同步代码块
    public synchronized static void m1() {

    }
    public static void m2() {
        synchronized (SellTicket3.class) {
            System.out.println("m2");
        }
    }








    public /*synchronized*/ void sell(){//1.同步方法，在同一个时刻，只能有一个线程来执行sell方法
        synchronized (this){//2.同步代码块，
            if(ticket1<=0){
                System.out.println("售票结束");
                loop=false;
                return;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("剩余票数"+(--ticket1));
        }
        }

    @Override
    public void run() {
        while (loop){
            sell();
        }
    }
}
class SellTicket1 extends Thread{
    private static int ticket1 = 100;

    @Override
    public void run() {
        while (true){
            if(ticket1<=0){
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("剩余票数"+(--ticket1));
        }
    }
}

class SellTicket2 implements Runnable{
    private int ticket1 = 100;
    @Override
    public void run() {
        while (true){
            if(ticket1<=0){
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("剩余票数"+(--ticket1));
        }
    }
}