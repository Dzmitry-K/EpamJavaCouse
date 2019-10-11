package BasicsOfSoftwareCodeDevelopment.LinearPrograms.FourthTask;
/**
 * Дано действильное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */
public class FourthTask {
    static double changeOfValues(double inputNumber) {
        int nnn = (int) inputNumber;
        int ddd = (int) ((inputNumber - nnn) * 1000);
        return Double.parseDouble(ddd + "." + nnn);
    }

    public static void main(String[] args) {
        System.out.println(changeOfValues(123.456));
    }
}
