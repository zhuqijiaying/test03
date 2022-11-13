package comFive_常用类.StringBuffer类;

public class StringBufferExercise02 {
    public static void main(String[] args) {
        String price = "8123456.23";
        StringBuffer sb = new StringBuffer(price);//将String转成StringBuffer
        for(int i = sb.lastIndexOf(".")-3;i>0;i-=3){
            sb = sb.insert(i,",");
        }

        System.out.println(sb);
    }
}
