package comFive_常用类.Date类;

import java.util.Calendar;

/**
 * @author zq
 */
public class Date02 {
    public static void main(String[] args) {
        //第二代日期类:日历
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println("年:"+c.get(Calendar.YEAR));
        System.out.println("月："+(c.get(Calendar.MONTH)+1));//返回月份从0开始，所有要加1
        System.out.println("日："+c.get(Calendar.DAY_OF_MONTH));
        System.out.println("这一年第"+c.get(Calendar.DAY_OF_YEAR)+"天");
        //......

        //问题和不足
        //1.可变性：像日期，时间应该是不可变的
        //2.偏移性：Date中的年份是从1900开始的，而月份都从0开始
        //3.格式化：格式化只对Date有用，Calender则不行
        //4.此外，他们也不是线程安全；不能处理闰秒等（每隔2天，多出1s）
    }
}
