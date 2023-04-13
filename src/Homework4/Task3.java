package Homework4;

public class Task3 {
    public static void main(String[] args) {
//        Задача 3. shift
//        да се напише функция, която получава като параметър масив
//        и връща първия елемент от масива, като същевременно го премахва от масива
//
//        Пример:
//        [1, 2, 3, 0, 12] => 1, [2, 3, 0, 12]
//        [] => undefined
        int[] array = {1, 2, 3, 0, 12, 5};
        int[] arrayWithoutFE = removeFirstElement(array);

        for (int element : arrayWithoutFE) {
            System.out.print(element + " ");
        }
    }

    private static int[] removeFirstElement(int[] array) {
        if (array.length == 0) {
            return new int[0];
        }

        int[] arrayWithoutFE = new int[array.length - 1];

        for (int i = 0, j = 1; i < array.length - 1; i++, j++) {
            arrayWithoutFE[i] = array[j];
        }

        return arrayWithoutFE;
    }
}
