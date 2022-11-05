package comThree.Exercise;

public class Homework07 {
    public static void main(String[] args) {
        Car car = new Car(50);
        car.getAir().flow();
    }
}
class Car {
    private double temp;

    public Car(double temp) {
        this.temp = temp;
    }

    class Air{
        public void flow(){
            if(temp>40){
                System.out.println("空调吹冷气");
            }else if(temp<0){
                System.out.println("空调吹暖气");
            }else {
                System.out.println("空调关闭");
            }
        }
    }
    public Air getAir(){
        return new Air();
    }
}