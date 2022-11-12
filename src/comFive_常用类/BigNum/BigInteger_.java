package comFive_常用类.BigNum;


import java.math.BigInteger;

/**
 * @author zq
 */
public class BigInteger_ {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("2324235345463549699935439025359999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999");
        BigInteger bigInteger1 = new BigInteger("5");
        BigInteger add = bigInteger.add(bigInteger1);
        System.out.println(bigInteger);
        System.out.println(add);
    }
}
