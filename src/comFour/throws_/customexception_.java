package comFour.throws_;

public class customexception_ {
    public static void main(String[] args) {
        int age = 880;
        if(!(age>=18&&age<=120)){
            throw new AgeException("年龄需在18-120");
        }
        System.out.println("你的年龄正确");
    }
}
class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}