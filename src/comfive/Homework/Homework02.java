package comfive.Homework;

import java.util.Scanner;

/**
 * @author zq
 */
/*输入用户名、密码、邮箱，如果信息录入正确，则提示注册成功，否则生成异常对象
    要求：
    1.用户名长度为2-4
    2.密码长度为6，全部为数字(isDigital方法)
    3.邮箱中包含@和. 并且@在.的前面
 */
public class Homework02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入名字：");
        String s = scanner.next();
        System.out.println("请输入密码：");
        String s1 = scanner.next();
        System.out.println("请输入邮箱：");
        String s2 = scanner.next();
        userRegister(s,s1,s2);
        System.out.println("注册成功");

    }
    public static void userRegister(String name,String pwd,String email){
        //加入一些校验
        if(!(name != null && pwd != null && email != null)){
            throw new RuntimeException("参数不能为空");
        }
        if(!(name.length()>=2&&name.length()<=4)){
            throw new RuntimeException("用户名长度为2-4");
        }
        if(!(pwd.length()==6&&isDigital(pwd))){
            throw new RuntimeException("密码长度为6，全部为数字");
        }
        int i = email.indexOf('@');
        int i1 = email.indexOf('.');
        if(!(i>-1 && i1>i)){
            throw new RuntimeException("邮箱中包含@和. 并且@在.的前面");
        }
    }
    public static boolean isDigital(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            if(chars[i]<'0'||chars[i]>'9'){
                return false;
            }
        }
        return true;
    }
}
