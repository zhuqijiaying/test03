package comThree.接口.多态;

public class test {
    public static void main(String[] args) {
        C c = new C();
        c.pX();
    }
}
interface A{
    int x=0;
}
class B{
    int x=1;
}
class C extends B implements A{
    public void pX(){
        //可以明确的指定x
        //访问接口的x就使用A.x
        //访问父类的x就使用super.x
        System.out.println();
    }
}