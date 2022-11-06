package comFour.枚举;

public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
    }
}
class Season{
    private String name;
    private String desc;//描述
    //定义了四个固定对象
    public static final Season SPRING = new Season("春天","动物交配的季节");
    public static final Season SUMMER = new Season("夏天","炎热吃冰的季节");
    public static final Season AUTUMN = new Season("秋天","落叶丰收的季节");
    public static final Season WINTER = new Season("冬天","阖家团圆的季节");
    //1.将构造器私有化，防止直接new创建对象
    //2.去掉set方法，防止属性被修改
    //3.在Season内部创建固定对象
    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
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