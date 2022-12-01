package comEight多线程基础.线程退出;

/**
 * @author zq
 */
public class ThreadExit_ {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.start();
        //希望主线程去控制T，线程的终止，必须可以修改loop变量
        //让t1退出run方法，从而终止T1线程 ->通知方式
        System.out.println("main线程休眠10秒");
        Thread.sleep(10*1000);
        t.setLoop(false);
    }
}
class T extends Thread{
    int count = 0;
    //设置一个控制变量
    private boolean loop = true;
    @Override
    public void run() {
        while (loop){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("你好..."+(++count));
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}