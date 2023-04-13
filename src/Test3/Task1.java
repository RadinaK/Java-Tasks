package Test3;

import java.util.*;

public class Task1 {
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
//[2,3,5,3,7,9,5,3,7] => [3,3,3,5,5,7,7,2,9]
//[2, 1, 2] => [2, 2, 1]
//[2, 1, 2, 1] => [1, 1, 2, 2]
        int[] array = {2, 3, 5, 3, 7, 9, 5, 3, 7};

        int[] sortedArray = sortArray(array);

        for (int element : sortedArray) {
            System.out.print(element + " ");
        }
    }

    private static int[] sortArray(int[] array) {
        int[] sortedArray = new int[array.length];
        Map<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < array.length; i++) {
            int number = array[i];

            if (!map.containsKey(number)) {
                map.put(number, 1);
            } else {
                map.put(number, map.get(number) + 1);
            }
        }
//        map.entrySet().stream()
//                .sorted(Map.Entry.comparingByValue());

//        map.entrySet().stream().sorted()
//
//        for (int i = 0; i < map.size(); i++) {
//            List<Integer> mapValues=new ArrayList<>(map.get(i));
//
//            for (int j = 0; j < mapValues.size(); j++) {
//                int number=sortedArray[j];
//
//                number=mapValues.get(j);
//            }
//        }

        map.entrySet().stream().sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        System.out.println();

        return sortedArray;
    }
}
