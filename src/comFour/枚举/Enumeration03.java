package comFour.枚举;

public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season2.WINTER);
    }
}
enum Season2{
    //3.有多个常量，用,间隔
    //4.使用enum来实现枚举，要求将定义常量对象，写在前面
    //5.如果我们使用的是无参构造器，创建常量对象，则可以省略（）
    SPRING("春天","温暖"),SUMMER("夏天","炎热"),
    AUTUMN("秋天","凉爽"),WINTER("冬天","寒冷")/*what;*/;//what调用的是无参构造器，可以省略()
    private String name;
    private String desc;//描述

    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
    private Season2(){

    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}