package comEight多线程基础.Method;

/**
 * @author zq
 */
/*
1.主线程每隔1s，输出hi，一共10次
2.当输出到hi5时，启动一个子线程(要求实现Runnable)，每隔1s输出hello，等该线程输出10次 hello后，退出
3.主线程继续输出 hi，直到主线程退出.
4.如图，完成代码
hi1
hi2
hi3
hi4
hi5
hello1
hello2
hello3
hello4
hello5
hello6
hello7
hello8
hello9
hello10
子线程结束
hi6
hi7
hi8
hi9
hi10
主线程结束
 */
public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new AA());
        for(int i = 1;i<=10;i++){
            System.out.println("hi"+i);
            Thread.sleep(1000);
            if(i==5){
                thread.start();
                thread.join();
            }

        }
        System.out.println("主线程结束");
    }
}
class AA implements Runnable{
    int count = 0;

    @Override
    public void run() {

        while (true){
            System.out.println("hello"+(++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(count == 10){
                System.out.println("子线程结束");
                break;
            }

        }

    }
}