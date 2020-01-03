package Algorithmization.One_Dimensional_Array.FifthTask;

import Algorithmization.One_Dimensional_Array.SecondTask.SecondTask;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */

public class FifthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array dimension: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        SecondTask.createArray(array);
        System.out.println("Source array:   " + Arrays.toString(array));
        compareElements(array);

    }

    private static void compareElements(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] > i)
                System.out.println("Value " + arr[i] + " is greater than its index [" + i + "]");
        }
    }
}
