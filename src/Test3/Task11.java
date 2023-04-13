package Test3;

import java.util.ArrayList;
import java.util.List;

public class Task11 {
    public static void main(String[] args) {
        //        Задача 1. сортиране по честота на елементите
//        да се напише функция която получава като парметър масив с числа и връща нов масив,
//        в който числата са сортирани по намаляваща честота на елементите.
//        ако два елмента се срещат еднакъв брой пъти първо се включват в резултата по малките.
//
//                може да приемем че стойностите са в диапазона 0 - 100.
//
//        Пример:
//
//          [2,3,5,3,7,9,5,3,7] => [3,3,3,5,5,7,7,2,9]
//          [2, 1, 2] => [2, 2, 1]
//          [2, 1, 2, 1] => [1, 1, 2, 2]
        int[] array = {1, 0, 1, 2};

        int[] sortedArray = sortArray(array);

        for (int element : sortedArray) {
            System.out.print(element + " ");
        }
    }

    private static int[] sortArray(int[] array) {
        int[] sortedArray = new int[array.length];
        int[] arr = new int[4];
        List<Integer> maxElements = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            int number = array[i];

            arr[number]++;
        }

        for (int i = 0; i < sortedArray.length; i++) {
            int maxNumInSortedArray = 0;
            int max = 0;
            int index = -1;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= max && arr[j] != 0) {
                    if (!maxElements.contains(arr[j])) {
                        max = arr[j];
                        index = j;
                    }
                }
                maxElements.add(index);
                for (int k = 0; k < max; k++) {
                    sortedArray[k] = index;
                }
            }
        }

        return sortedArray;

    }
}


