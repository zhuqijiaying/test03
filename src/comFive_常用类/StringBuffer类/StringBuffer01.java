package comFive_常用类.StringBuffer类;
        /*
        String保存的是字符串常量，里面的值不能更改，每次Sting类的更新实际上就是更改地址，效率低
        StringBuffer保存的是字符串变量，里面的值可以更改，每次StringBuffer的更新实际上可以更新内容，不用每次更新地址，效率较高
         */
public class StringBuffer01 {
    public static void main(String[] args) {
        //1.StringBuffer的直接父类AbstractStringBuilder
        //2.StringBuffer实现了Serializable，即StringBuffer的对象可以串行化
        //3.
        StringBuffer stringBuffer = new StringBuffer("hello");





    }
}
