package Test4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
//        Задача 2
//        даден е масив с последователни числа, в произволен ред, едно от които лиспсва.
//        да се напише функция получава като параметър този масив и връща липсващото число.
//                Пример:
//                [1, 3, 4, 5] => 2
//                [3, 1, 5, 4] => 2
//                [1, -1, 3, 2] => 0
        int[] array = {1, -1, 3, 2};
        System.out.println(missingNumber(array));
    }

    private static int missingNumber(int[] array) {
        int missingNum = -10;
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//
//        for (int i = 0; i < array.length; i++) {
//            int number = array[i];
//
//            if (number < min) {
//                min = number;
//            }
//            if (number > max) {
//                max = number;
//            }
//        }
//
//        List<Integer> list = new ArrayList<>(max - min + 1);
//        for (int i = min; i <= max; i++) {
//            list.add(i);
//        }


        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }

//        int i = 0;
        for (int n : set) {
            if (n != n + 1) {
                return n + 1;
            }
        }
//

        return missingNum;
    }
}
