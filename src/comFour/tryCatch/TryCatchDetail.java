package comFour.tryCatch;

public class TryCatchDetail {
    public static void main(String[] args) {
        //Ctrl+Alt+T快捷键
        //1.如果异常发生了，则异常后面的代码不会执行，直接进入到catch块中
        //2.如果异常没有发生，则顺序执行try代码块，不会进入到catch
        try {
            String str = "1k";
            int a = Integer.parseInt(str);
            System.out.println("数字:"+a);
        } catch (NumberFormatException e) {
            System.out.println("异常信息="+e.getMessage());
            //3.不管是否发生异常，都执行某段代码块，则使用finally
        }finally{
            System.out.println("程序继续执行");
        }
        System.out.println("程序继续执行");

            //4.使用多个catch分别捕获异常，子类异常写前面，父类异常写后面
        try {
            Person person = new Person();
            person=null;
            System.out.println(person.getName());
            int n1 = 0;
            int n2 = 0;
            int res = n1/n2;
            System.out.println(res);
        }catch (NullPointerException e){
            System.out.println("空指针异常"+e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("算术异常"+e.getMessage());
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
        }
    }
}
class Person{
    private String name = "jack";

    public String getName() {
        return name;
    }
}