package comThree.接口.detail;

public class InterfaceDetail {
    public static void main(String[] args) {
        System.out.println(IB.n1);//说明n1是static
        //IB.n1 = 1009; n1值不能被修改，说明n1是final
    }
}
interface IB{
    //接口中的属性，只能是final的，而且是public static final修饰符
    int n1 =100;
    void hi();
}
interface IC extends IB{
    void ok();
}
class Pig implements IC{


    @Override
    public void hi() {

    }

    @Override
    public void ok() {

    }
}