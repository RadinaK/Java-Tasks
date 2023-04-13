package Homework5;

public class Task1 {
    public static void main(String[] args) {
//        Задача 1. lastIndexOf
//        да се напише функция, която получава като параметър масив и
//        проста стойност (число, boolean, стринг) и връща число отговарящо
//        на последната позиция в масива на която се среща тази стойност.
//        в случай че стойността не е намерана да върне -1.
//
//        lastIndexOf(arr, searchElement)
//        Функцията да има незадължителен трети параметър който указва от коя позиция да започне търсенето
//
//        indexOf(arr, searchElement, fromIndex)
//        Пример:
//                [1, 0, 3, 0, 12], 0 => 3
//                [1, 0, 3, 0, 12], 0, 2 => 1
//                [1, 2, 3, 0, 12], 4 => -1
        int[] array = {1, 0, 3, 0, 12};
        int searchElement = 0;
        int fromIndex = 2;

        System.out.println(indexOf(array, searchElement));
        System.out.println(indexOf(array, searchElement, fromIndex));
    }

    private static int indexOf(int[] array, int searchElement) {
        return indexOf(array, searchElement, array.length - 1);
    }

    private static int indexOf(int[] array, int searchElement, int fromIndex) {
        for (int i = fromIndex; i >= 0; i--) {
            if (array[i] == searchElement) {
                return i;
            }
        }

        return -1;
    }
}
