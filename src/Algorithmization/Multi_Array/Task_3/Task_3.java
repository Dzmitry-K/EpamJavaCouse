package Algorithmization.Multi_Array.Task_3;
import Algorithmization.Multi_Array.Task_1.Task_1;

/**
 *  Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

public class Task_3 {
    public static void main(String[] args) {
        int[][] array = Task_1.createMatrix();
        Task_1.fillingMatrix(array);
        Task_1.showMatrix(array);
    }
}
