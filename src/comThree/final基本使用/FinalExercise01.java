package comThree.final基本使用;

public class FinalExercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.cal();

    }
}
class Circle{
    private double redius;
    private final double PI;

    public Circle(double redius) {
        this.redius=redius;
    }
    {
        PI = 3.14;
    }
    public void cal(){
        //return PI*redius*redius;
        System.out.println(PI*redius*redius);
    }
}
