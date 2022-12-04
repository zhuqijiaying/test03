package comEight多线程基础.Method;

/**
 * @author zq
 */
//守护线程
public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        //我们希望主线程结束后，子线程自动结束
        //只需将子线程设置成守护线程
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();

        for (int i = 1;i<=10;i++){
            System.out.println("王宝强辛苦工作");
            Thread.sleep(1000);
        }
    }
}
class  MyDaemonThread extends Thread{
    @Override
    public void run() {
        //while (true){
        for(; ;){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("马蓉与宋喆快乐聊天，哈哈哈");
        }

    }
}