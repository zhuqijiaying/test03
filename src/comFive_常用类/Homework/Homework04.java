package comFive_常用类.Homework;

/**
 * @author zq
 */
//输入字符串，判断里面有多少个大写，多少个小写，多少个数字，并输出
public class Homework04 {
    public static void main(String[] args) {
         countStr("213e3swq12eA778gaUGT78a3@#gAYau7");
    }
    public static void countStr(String str){
        if(str==null){
            System.out.println("不能为空，请重新输入");
        }
        int count1= 0;
        int count2= 0;
        int count3= 0;
        int otherCount= 0;
        for (int i = 0; i <str.length(); i++) {
            if(str.charAt(i)<='9'&&str.charAt(i)>='0'){
                count1++;
            }else if(str.charAt(i)<='z'&&str.charAt(i)>='a') {
                count2++;
            }else if(str.charAt(i)<='Z'&&str.charAt(i)>='A'){
                count3++;
            }else{
                otherCount++;
            }
        }
        System.out.println("数字有"+count1+"个");
        System.out.println("小写字母有"+count2+"个");
        System.out.println("大写字母有"+count3+"个");
        System.out.println("其他字符有"+otherCount+"个");


    }
}
