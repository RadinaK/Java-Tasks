package Homework1;

import java.util.ArrayList;
import java.util.List;

public class Task3SecondWay {
    public static void main(String[] args) {
        int[] array = {1, 3, 1, 2, 5, 2, 1, 3};
        int[] sortedArray = new int[array.length];

        sortedArray = sortArray(array);
        for (int number : sortedArray) {
            System.out.print(number + " ");
        }
    }

    private static int[] sortArray(int[] array) {
        int[] sortedArray = new int[array.length];
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            sort(array, i, list);
        }
        addNumbersToArray(sortedArray, list);

        return sortedArray;
    }

    private static void addNumbersToArray(int[] sortedArray, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            sortedArray[i] = list.get(i);
        }
    }

    private static List<Integer> sort(int[] array, int number, List<Integer> list) {
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (element == number) {
                list.add(element);
            }
        }
        return list;
    }
}
