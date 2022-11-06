package comFour.枚举;

public class Execise {
    public static void main(String[] args) {
        Week[] values = Week.values();
            for(Week week: values){//增强for循环
                System.out.println(week);
            }
    }
}
enum Week{
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),
    THURSDAY("星期四"),FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期天");
    private String name;
    Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}