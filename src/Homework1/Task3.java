package Homework1;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {1, 3, 1, 2, 5, 2, 1, 3};
        int[] sortedArray = new int[array.length];

        sortedArray = sortArray(array);
        for (int number : sortedArray) {
            System.out.print(number + " ");
        }
    }

    private static int[] sortArray(int[] array) {
        int[] sortedArray = new int[array.length];
        List<Integer> one = new ArrayList<>();
        List<Integer> two = new ArrayList<>();
        List<Integer> three = new ArrayList<>();
        List<Integer> four = new ArrayList<>();
        List<Integer> five = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            if (number == 1) {
                one.add(number);
            } else if (number == 2) {
                two.add(number);
            } else if (number == 3) {
                three.add(number);
            } else if (number == 4) {
                four.add(number);
            } else if (number == 5) {
                five.add(number);
            }
        }

        for (int i = 0; i < one.size(); i++) {
            sortedArray[i] = one.get(i);
        }
        for (int i = 0; i < two.size(); i++) {
            sortedArray[one.size() + i] = two.get(i);
        }
        for (int i = 0; i < three.size(); i++) {
            sortedArray[one.size() + two.size() + i] = three.get(i);
        }
        for (int i = 0; i < four.size(); i++) {
            sortedArray[one.size() + two.size() + three.size() + i] = four.get(i);
        }
        for (int i = 0; i < five.size(); i++) {
            sortedArray[one.size() + two.size() + three.size() + four.size() + i] = five.get(i);
        }

        return sortedArray;
    }
}
