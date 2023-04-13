package Homework10;

import java.util.ArrayList;
import java.util.List;

public class Task2Final {
    public static void main(String[] args) {
//        Задача 2. сливане на припокриващи се интервали
//        да се напише функция mergeRanges която получава като параметър масив от масиви,
//        всеки от които описва числов интервл с 2 стойности - начало и край:
//
//          [[1, 5], [2, 4], [8, 12], [10, 13]]
//
//        функцията да връща масив с интервали, в който всички припокриващи се
//        или долепени1 интервали от входни масив са слети в нов интервал.
//
//          [[1, 5], [2, 4]] => [[1, 5]]
//          [[1, 5], [6, 8]] => [[1, 5], [6, 8]]
//          [[1, 5], [5, 6]] => [[1, 6]]
//          [[1, 5], [4, 7], [6, 8]] => [[1, 8]]
        int[][] array = {{1, 5}, {4, 7}, {6, 8}};

        int[][] newRanges = mergeRanges(array);

    }

    private static int[][] mergeRanges(int[][] array) {
        List<Integer> index1 = new ArrayList<>();
        List<Integer> index2 = new ArrayList<>();


        int[][] newRanges = null;

        return newRanges;
    }
}
