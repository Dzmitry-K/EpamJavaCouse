package BasicsOfSoftwareCodeDevelopment.Cycles.FirstTask;
/**
 * Напишите программу, где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 */
public class FirstCyclesTask {
    static int summ(int x) {
        int result = 0;
        for (int i = 0; i <= x; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(summ(5));
    }
}
