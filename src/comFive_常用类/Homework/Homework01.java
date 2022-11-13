package comFive_常用类.Homework;

/**
 * @author zq
 */
//实现字符串指定部分进行反转
public class Homework01 {
    public static void main(String[] args) {
        String str="abcdefg";
        System.out.println(str);
        str = reverse(str,1,str.length()-1);
        System.out.println(str);
    }

    public static String reverse(String str,int start,int end){
        //对输入的参数做一个验证
        if(!(str != null && start>0 && end>start && end < str.length())){
            throw new RuntimeException("参数不正确");
        }
        char[] chars = str.toCharArray();
        char temp = ' ';
        for (int i = start,j=end; i < j; i++,j--) {
            temp=chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
        }
        return new String(chars);
    }

}
