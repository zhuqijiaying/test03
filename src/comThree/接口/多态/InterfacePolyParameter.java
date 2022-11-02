package comThree.接口.多态;

public class InterfacePolyParameter {
    public static void main(String[] args) {
        //接口的多态体现
        //接口类型的变量if01 可以指向实现了IF接口的对象实例
        IF if01 = new Monster();
        if01  = new Car();
    }
}
interface IF{ }
class Monster implements IF{}
class Car implements IF{}