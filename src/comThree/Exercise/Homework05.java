package comThree.Exercise;

public class Homework05 {
    public static void main(String[] args) {
        A a = new A();
        a.f1();
    }
}
class A{
    final private String name="muck";
    public void f1(){
        class B{
            final private String NAME="jack";
            public void show(){
                System.out.println(NAME+"\t"+A.this.name);
            }
        }
        B b = new B();
        b.show();
    }
}