package comEight多线程基础.threaduse;

/**
 * @author zq
 */
public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //dog.start();不能调用start()
        Thread thread = new Thread(dog);
        thread.start();
    }
}
class Dog implements Runnable{//通过Runnable接口，开发线程
    int count = 0;
    @Override
    public void run() {
        while (true){
            System.out.println("狗叫"+(++count)+"次"+Thread.currentThread().getName());
            //休眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(count==10){
                break;
            }
        }
    }
}