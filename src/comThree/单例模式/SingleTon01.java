package comThree.单例模式;

public class SingleTon01 {
    public static void main(String[] args) {
        GirlFirend instance = GirlFirend.getInstance();
        System.out.println(instance);
    }
}
class GirlFirend{
    private String name;

    private static GirlFirend gf = new GirlFirend("小红");
    //饿汉式：没有使用实例，它也会创建
    //保障我们只能创建一个GirlFriend对象
    //1.将构造器私有化
    //2.在类的内部直接创建
    //3.提供一个公共的static静态方法，返回gf对象
    private GirlFirend(String name) {
        this.name = name;
    }
    public static GirlFirend getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFirend{" +
                "name='" + name + '\'' +
                '}';
    }
}