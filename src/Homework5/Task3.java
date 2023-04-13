package Homework5;

public class Task3 {
    public static void main(String[] args) {
//        Задача 3. subarray
//        да се разработят набор функции subarray, които получават като първи параметър масив
//        и връщат друг масив, който съдържа част от елементите на входния масив както следва:
//
//        subarray(arr, start) - връща всички елемнети от позиция start до края на масива
//        subarray(arr, start, end) - връща всички елемнети от позиция start до позиция end
        int[] array = {1, 0, 3, 0, 12, 6, 8, 0};
        int start = 2;
        int end = 5;
        int[] modifiedArray1 = subarray(array, start);
        int[] modifiedArray2 = subarray(array, start, end);

        printArray(modifiedArray1);
        printArray(modifiedArray2);
    }

    private static void printArray(int[] modifiedArray) {
        for (int element : modifiedArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static int[] subarray(int[] array, int start) {
        int[] modifiedArray = new int[array.length - start];

        for (int i = start; i < array.length; i++) {
            modifiedArray[i - start] = array[i];
        }

        return modifiedArray;
    }

    public static int[] subarray(int[] array, int start, int end) {
        int[] modifiedArray = new int[end - start + 1];

        for (int i = start; i <= end; i++) {
            modifiedArray[i - start] = array[i];
        }

        return modifiedArray;
    }
}
