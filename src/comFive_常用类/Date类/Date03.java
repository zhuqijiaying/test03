package comFive_常用类.Date类;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author zq
 */
public class Date03 {
    public static void main(String[] args) {
        //第三代日期
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        //自己设置格式
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");
        String format = dateTimeFormatter.format(ldt);
        System.out.println(format);


        System.out.println("年="+ldt.getYear());
        System.out.println("月="+ldt.getMonth());
        System.out.println("月="+ldt.getMonthValue());
        System.out.println("日="+ldt.getDayOfMonth());


        //提供plus和minus方法可以对当前时间进行加或者减
        //看看890天后是什么时候
        LocalDateTime localDateTime = ldt.plusDays(890);
        System.out.println(dateTimeFormatter.format(localDateTime));

        //10分钟前是？
        LocalDateTime localDateTime1 = ldt.minusMinutes(10);
        System.out.println(dateTimeFormatter.format(localDateTime1));
    }
}
