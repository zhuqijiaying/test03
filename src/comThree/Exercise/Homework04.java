package comThree.Exercise;

public class Homework04 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.testWork(new Computer() {
            @Override
            public double work(double n1, double n2) {
                return n1+n2;
            }
        },10,8);
    }
}
interface Computer{
    public double work(double n1,double n2);
}
class CellPhone {


    public void testWork(Computer computer,double n1,double n2){
        double result = computer.work(n1, n2);
        System.out.println(result);
    }
}