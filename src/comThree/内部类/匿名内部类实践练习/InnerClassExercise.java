package comThree.内部类.匿名内部类实践练习;

public class InnerClassExercise {
    public static void main(String[] args) {
        //当做实参直接传递，简洁高效
        f1(new IA(){
            @Override
            public void show() {
                System.out.println("名画");
            }
        });

        //传统方法
        f1(new Picture());

    }
    //静态方法，形参是接口类型
    public static void f1(IA ia){
        ia.show();
    }
}
interface IA{
    void show();
}
class Picture implements IA{
    @Override
    public void show() {
        System.out.println("名画1");
    }
}