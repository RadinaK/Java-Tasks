package Homework4;

public class Task1 {
    public static void main(String[] args) {
//        Задача 1. indexOf
//        да се напише функция, която получава като параметър масив и проста стойност (число, boolean, стринг)
//        и връща число отговарящо на първата позиция в масива на която се среща тази стойност.
//        в случай че стойността не е намерана да върне -1.
//        indexOf(arr, searchElement)
//        Функцията да има незадължителен трети параметър който указва от коя позиция да започне търсенето
//        indexOf(arr, searchElement, fromIndex)
//        Пример:
//        [1, 2, 3, 0, 12], 3 => 2
//        [1, 2, 3, 0, 12], 1 => 0
//        [1, 2, 3, 0, 12], 4 => -1
        int[] array = {1, 2, 3, 0, 12, 1};
        int searchElement = 1;
        int fromIndex = 0;
        System.out.println(indexOf(array, searchElement));
        System.out.println(indexOf(array, searchElement, fromIndex));

    }

    private static int indexOf(int[] array, int searchElement) {
        return indexOf(array, searchElement, 0);
    }

    private static int indexOf(int[] array, int searchElement, int fromIndex) {
        int position = -1;

        for (int i = fromIndex; i < array.length; i++) {
            if (array[i] == searchElement) {
                position = i;
                break;
            }
        }

        return position;
    }
}
