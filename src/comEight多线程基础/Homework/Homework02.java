package comEight多线程基础.Homework;

/**
 * @author zq
 */
public class Homework02 {
    public static void main(String[] args) {
        AA aa = new AA();
        Thread thread = new Thread(aa);
        thread.setName("线程1");
        Thread thread1 = new Thread(aa);
        thread1.setName("线程2");
        thread.start();
        thread1.start();

    }
}

class AA implements Runnable {
    private int num = 10000;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {

                if (num < 1000) {
                    System.out.println("余额不足");
                    break;
                }
                System.out.println(Thread.currentThread().getName() + "取1000,余额" + (num -= 1000));
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }

    }
}