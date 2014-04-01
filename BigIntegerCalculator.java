/*
 * Using BigInterger library in the java.math.BigInteger.
 */
import java.math.BigInteger;

public class BigIntegerCalculator {
        public static void main(String[] args) {

                // 2 x 10^100
                BigInteger big = new BigInteger(
                                "2000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
                System.out.println(big);

                // + 1
                big = big.add(BigInteger.ONE);
                System.out.println(big);

                // - 3
                big = big.subtract(BigInteger.valueOf(3));
                System.out.println(big);

                // * 2
                big = big.multiply(BigInteger.valueOf(2));
                System.out.println(big);

                // / 2 : It returns a Integer.
                big = big.divide(BigInteger.valueOf(2));
                System.out.println(big);

                // * 0
                big = big.multiply(BigInteger.ZERO);
                System.out.println(big);

                int x;
                x = big.compareTo(big);
                System.out.println(x);
                
                x = big.compareTo(BigInteger.valueOf(-1));
                System.out.println(x);
                
                x = big.compareTo(big.add(BigInteger.valueOf(1)));
                System.out.println(x);                
        }
}
