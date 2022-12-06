package comEight多线程基础.Homework;

import java.util.Queue;
import java.util.Scanner;

/**
 * @author zq
 */
public class Homework01 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
        a.start();
        b.start();
    }
}
class A extends Thread{
    private boolean loop = true;
    @Override
    public void run() {
        while (loop) {
            System.out.println((int) (Math.random() * 100 + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
class B extends Thread{
    private A a;
    private Scanner scanner = new Scanner(System.in);


    public B(A a) {//构造器传入A对象
        this.a = a;
    }

    @Override
    public void run() {
        //接收用户输入
        while (true){
            System.out.println("请输入你的指令(Q)表示退出");
            char key = scanner.next().toUpperCase().charAt(0);
            if(key=='Q'){
                //以通知的方式结束线程1
                a.setLoop(false);
                System.out.println("B线程退出");
                break;
            }
        }
    }
}