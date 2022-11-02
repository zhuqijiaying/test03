package comThree.接口.多态.接口多态传递;
/*
演示多态传递现象
 */
public class InterfacePolyPass {
    public static void main(String[] args) {
        //接口类型变量可以指向，实现了该接口的类的对象实例
        IG ig = new Teacher();
        //如果IG继承了IH接口，且Teacher类实现了IG接口，那么，实际上就相当于Teacher类也实现了IH接口
        //这就是多态传递
        IH ih = new Teacher();
    }
}
interface IH{}
interface IG extends IH{}
class Teacher implements IG{

}