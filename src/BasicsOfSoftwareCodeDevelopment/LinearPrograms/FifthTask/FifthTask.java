package BasicsOfSoftwareCodeDevelopment.LinearPrograms.FifthTask;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
 * ННч ММмин SSc.
 */

public class FifthTask {
    static String transformTime(int inputSeconds) {
        int hours = inputSeconds / 3600;
        int minutes = (inputSeconds % 3600) / 60;
        int seconds = inputSeconds % 60;
        return hours + "ч " + minutes + "мин " + seconds + "с";
    }

    public static void main(String[] args) {
        System.out.println(transformTime(3721));
    }
}
