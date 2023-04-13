package Test3;

import java.util.ArrayList;
import java.util.List;

public class Task1Final {
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
        int[] array = {2, 3, 5, 3, 7, 9, 5, 3, 7};
        int[] array1 = {1, 0, 99, 50, 99, 100};
        int[] array2 = {1, 0, 1, 2};
        int[] array3 = {2, 1, 2, 1};

        int[] sortedArray = sortArray(array2);

        for (int element : sortedArray) {
            System.out.print(element + " ");
        }
    }

    private static int[] sortArray(int[] array) {
        int[] count = new int[102];

        for (int number : array) {
            count[number]++;
        }

        List<Integer> sortedList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int maxFrequency = 0;
            int index = 0;

            for (int j = 0; j < count.length - 1; j++) {
                int n1 = count[j];
                if (n1 == 0 || n1 <= maxFrequency) {
                    continue;
                }

                for (int k = j + 1; k < count.length; k++) {
                    int n2 = count[k];
                    if (n1 >= n2) {
                        maxFrequency = n1;
                        index = j;
                    }
                }
            }
            count[index] = 0;
            for (int k = 0; k < maxFrequency; k++) {
                sortedList.add(index);
            }
        }

        return fillArray(sortedList, array);
    }



    private static int[] fillArray(List<Integer> sortedList, int[] array) {
        int[] sortedArray = new int[array.length];

        for (int i = 0; i < sortedList.size(); i++) {
            sortedArray[i] = sortedList.get(i);
        }

        return sortedArray;
    }
}



