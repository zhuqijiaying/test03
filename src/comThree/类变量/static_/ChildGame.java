package comThree.类变量.static_;

public class ChildGame {
    public static void main(String[] args) {

        //int count = 0;
        Child child1 = new Child("白骨精");
        child1.join();
        child1.count++;
        //count++;
        Child child2 = new Child("狐狸精");
        child2.join();
        child2.count++;

        //count++;
        Child child3 = new Child("黑熊精");
        child3.join();
        child3.count++;
        //count++;
        System.out.println("共有"+Child.count+"个小孩加入游戏");
        System.out.println(child1.count);
        System.out.println(child2.count);
        System.out.println(child3.count);

    }
}
class Child{
    private String name;
    //定义一个变量count，是一个类变量
    public static int count = 0;
    public Child(String name) {
        this.name = name;
    }
    public void join(){

    }
}