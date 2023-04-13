package Test3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
//        Задача 3
//        да се разработи функция която получава като параметър масив и връща друг масив
//        в който всяка стойност от първия масив се съдържа само веднъж, като се запазва първоначалното подреждане
//
//        Пример:
//
//        3, 12, 5, 12, 8, 5 => 3, 12, 5, 8
//        1, 2, 3, 2, 1 => 1, 2, 3
        int[] array = {3, 12, 5, 12, 8, 5};
        int[] array1 = {1, 2, 3, 2, 1};

        int[] sortedArray = sortArray(array);

        for (int element : sortedArray) {
            System.out.print(element + " ");
        }
    }

    private static int[] sortArray(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int number = array[i];

            if (!list.contains(number)) {
                list.add(number);
            }
        }

        return toArray(list);
    }

    private static int[] toArray(List<Integer> list) {
        int[] sortedArray = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            sortedArray[i] = list.get(i);
        }

        return sortedArray;
    }
}
