package BasicsOfSoftwareCodeDevelopment.LinearPrograms.ThirdTask;

import static java.lang.Math.*;

/**
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * ((sin(x) + cos(y)) / (cos(x) - sin(y)) * tg(x * y)
 * */
public class ThirdTask {
    public static void main(String[] args) {
        System.out.println(functionValue(30,45));
    }

    static double functionValue(double x, double y) {
        double a = toRadians(x);
        double b = toRadians(y);
        return (sin(a) + cos(b)) / (cos(a) - sin(b)) * tan(a * b);
    }
}
