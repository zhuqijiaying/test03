package comThree.接口;

public class ExtendsVSInterface {
    public static void main(String[] args) {
        LittleMoney littleMoney = new LittleMoney("悟空");
        littleMoney.climbing();
        littleMoney.swimming();
        littleMoney.flying();
    }
}

//当子类继承了父类，就自动拥有父类的功能
//如果子类需要扩展功能，可以通过接口的方式实现



class Monkey{
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void climbing(){
        System.out.println(name+"猴子会爬树");
    }
}
interface Bird{
    void flying();
}
interface Fish{
    void swimming();
}

class LittleMoney extends Monkey implements Fish,Bird{
    public LittleMoney(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName()+"通过学习可以像鱼儿一样游泳");
    }

    @Override
    public void flying() {
        System.out.println(getName()+"通过学习可以像鸟儿一样飞翔");
    }
}