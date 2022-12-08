package comEight多线程基础.threaduse;

/**
 * @author zq
 */
public class SellTicket {
    public static void main(String[] args) {
//        SellTicket1 sellTicket1 = new SellTicket1();
//        SellTicket1 sellTicket2 = new SellTicket1();
//        SellTicket1 sellTicket3 = new SellTicket1();
//        sellTicket1.start();
//        sellTicket2.start();
//        sellTicket3.start();
        SellTicket2 sellTicket2 = new SellTicket2();
        new Thread(sellTicket2).start();
        new Thread(sellTicket2).start();
        new Thread(sellTicket2).start();
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