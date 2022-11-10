package comFive_常用类.Date类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zq
 */
//第一代日期类
public class Date01 {
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();//获取当前时间
        System.out.println("当前日期="+d1);//国外方式输出
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");//将当前日期转换成指定的输出格式
        String format = sdf.format(d1);
        System.out.println("当前日期="+format);

        //把String转成指定对应的Date
        String s = "1977年7月29日 12:29:34 周五";
        Date parse =sdf.parse(s);
        System.out.println("parse="+sdf.format(parse));
    }
}
