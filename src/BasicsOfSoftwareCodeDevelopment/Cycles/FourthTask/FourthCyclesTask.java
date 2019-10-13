package BasicsOfSoftwareCodeDevelopment.Cycles.FourthTask;

import java.math.BigInteger;
/**
 * Составить программу нахождения произведения квадратов первых двухсот чисел.
 */
public class FourthCyclesTask {
    static BigInteger squareMultiplication(){
        BigInteger res = BigInteger.valueOf(1);
        BigInteger pre_res;
        for (int i = 2; i < 20; i++) {
            pre_res = BigInteger.valueOf(i).multiply(BigInteger.valueOf(i));
            res = res.multiply(pre_res);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(squareMultiplication());
    }
}