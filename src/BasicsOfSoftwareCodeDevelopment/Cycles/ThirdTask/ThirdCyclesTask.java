package BasicsOfSoftwareCodeDevelopment.Cycles.ThirdTask;
/**
 * Найти сумму квадратов первых ста чисел.
 */
public class ThirdCyclesTask {
    static int sumOfSquares() {
        int res = 0;
        for (int i = 1; i < 100; i++) {
            res += i * i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(sumOfSquares());
    }

}
