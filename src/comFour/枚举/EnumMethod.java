package comFour.枚举;

public class EnumMethod {
    public static void main(String[] args) {
        Season2 autumn = Season2.AUTUMN;
        //1.输出枚举对象名称
        System.out.println(autumn.name());
        //2.ordinal()输出枚举对象的次序，从0开始编号，秋天在第三个，输出2
        System.out.println(autumn.ordinal());
        //3.从反编译可以看出values方法，返回Season2[]
        //含有定义的所有枚举对象
        Season2[] values = Season2.values();
        System.out.println("=========取出枚举对象(增强for)=========");
        for(Season2 season2: values){//增强for循环
            System.out.println(season2);
        }
        //4.valueOf:将字符串转换成枚举对象，要求字符串必须为已有的常量名，否则报异常！
        Season2 autumn1 = Season2.valueOf("AUTUMN");
        System.out.println("autumn1="+autumn1);
        System.out.println(autumn==autumn1);//true
        //5.compareTo:比较两个枚举常量，比较的就是编号
        System.out.println(Season2.AUTUMN.compareTo(Season2.SPRING));
    }
}
