package Test4;

import java.util.Set;
import java.util.TreeSet;

public class Task2Final {
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
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }

        for (int n : set) {
            if (n != n + 1) {
                return n + 1;
            }
        }

        return 0;
    }
}
