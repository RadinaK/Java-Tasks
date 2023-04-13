package Homework6;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
//        Задача 1. премахване на повторенията от масив
//        да се напише функция която получава като параметър сортиран масив
//        и връща друг масив в който всяко число се среща само веднъж
//
//        Пример [1, 2, 3, 3, 4, 4, 5] -> [1, 2, 3, 4, 5]
        int[] array = {1, 1, 2, 3, 3, 4, 4, 5, 5};
        Integer[] modifiedArray = modifyArray(array);

        for (int element : modifiedArray) {
            System.out.print(element + " ");
        }
    }

    private static Integer[] modifyArray(int[] array) {
        List<Integer> list = new ArrayList<>();
        list.add(array[0]);

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                list.add(array[i+1]);
            }
        }

        Integer[] modifiedArray = list.toArray(new Integer[0]);

        return modifiedArray;
    }
}
