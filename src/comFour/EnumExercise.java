package comFour;

public class EnumExercise {
    public static void main(String[] args) {
        Color blue = Color.BLUE;
        blue.show();
        //枚举对象在switch中匹配使用
        switch (blue){
            case BLACK:
                System.out.println("匹配到黄色");
                break;
        }
    }
}
enum Color implements IA{
    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,0,0),
    GREEN(0,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println(redValue+","+greenValue+","+blueValue);
    }
}
interface IA{
    public void show();
}