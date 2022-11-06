package comFour.注解;

public class Override_ {
    public static void main(String[] args) {

    }
}
class Father{
    public void cry(){
        System.out.println("哭了");
    }
}
class Son extends Father{
    @Override
    public void cry() {
        super.cry();
    }


}
