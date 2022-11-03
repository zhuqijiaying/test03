package comThree.内部类.匿名内部类实践练习;

public class Exercise01 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmClock(new Bell(){
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        cellPhone.alarmClock(new Bell(){
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });
    }
}
interface Bell{
    void ring();
}
class CellPhone{
    public void alarmClock(Bell bell) {
        bell.ring();

    }
}