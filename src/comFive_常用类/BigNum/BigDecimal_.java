package comFive_常用类.BigNum;

import java.math.BigDecimal;

/**
 * @author zq
 */
public class BigDecimal_ {
    public static void main(String[] args) {
        //保存一个精度较高的小数
        BigDecimal bigDecimal = new BigDecimal("21434.12421432412321434");
        BigDecimal bigDecimal1 = new BigDecimal(13);
        System.out.println(bigDecimal);
        System.out.println(bigDecimal.multiply(bigDecimal1));
        System.out.println(bigDecimal.add(bigDecimal1));
        System.out.println(bigDecimal.subtract(bigDecimal1));
        //当除不尽的时候，指定精度
        System.out.println(bigDecimal.divide(bigDecimal1,BigDecimal.ROUND_CEILING));
    }
}
