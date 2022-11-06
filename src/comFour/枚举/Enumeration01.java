package comFour.枚举;

public class Enumeration01 {
    public static void main(String[] args) {
        Season1 spring = new Season1("春天","动物交配的季节");
        Season1 summer = new Season1("夏天","炎热吃冰的季节");
        Season1 autumn = new Season1("秋天","落叶丰收的季节");
        Season1 winter = new Season1("冬天","阖家团圆的季节");
        //对于季节而言，它的对象只有固定的4个，不会更多，上面设计不能体现季节是固定的四个对象

    }
}
class Season1{
    private String name;
    private String desc;//描述

    public Season1(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}