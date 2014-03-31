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
                System.out.println();

                // + 1
                big = big.add(BigInteger.ONE);
                System.out.println(big);
                System.out.println();

                // - 3
                big = big.subtract(BigInteger.valueOf(3));
                System.out.println(big);
                System.out.println();

                // * 2
                big = big.multiply(BigInteger.valueOf(2));
                System.out.println(big);
                System.out.println();

                // / 2 : It returns a Integer.
                big = big.divide(BigInteger.valueOf(2));
                System.out.println(big);
                System.out.println();

                // * 0
                big = big.multiply(BigInteger.ZERO);
                System.out.println(big);
                System.out.println();

        }
}
