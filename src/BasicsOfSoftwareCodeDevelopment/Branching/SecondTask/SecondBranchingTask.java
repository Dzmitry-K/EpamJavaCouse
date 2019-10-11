package BasicsOfSoftwareCodeDevelopment.Branching.SecondTask;

/**
 * Найти max{min(a, b), min(c, d)}
 */

public class SecondBranchingTask {
    static int max(int a, int b) {
        return a > b ? a : b;
    }

    static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(max(min(1, 2), min(3, 4)));
    }
}
