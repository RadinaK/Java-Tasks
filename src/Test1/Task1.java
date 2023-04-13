package Test1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 8, 0, 6, 3, 0, 3, 4};
        int number = 3;
        int[] biggestNumbers = new int[number];
        biggestNumbers = getBiggestNumbers(array, number);

        for (int element : biggestNumbers) {
            System.out.print(element + " ");
        }
    }

    private static int[] getBiggestNumbers(int[] array, int number) {
        if (number <= 0 || number > array.length) {
            return new int[0];
        }

        int[] biggestNumbers = new int[number];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < biggestNumbers.length; j++) {
                if (array[i] > biggestNumbers[j]) {
                    biggestNumbers[j] = array[i];
                    break;
                }
            }
        }
        return biggestNumbers;
    }
}
