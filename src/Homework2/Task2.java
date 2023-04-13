package Homework2;

public class Task2 {
    public static void main(String[] args) {
//        Задача 2 - текуща сума
//        да се напипе функция която получава като параметър масив от числа.
//        функцията да връща друг масив със същия брой елементи, като всяко число съдържа сумата на всички до текущото
//        Пример:
//        1, 3 => 1, 4
//        1, 2, 3 => 1, 3, 6
//        2, -1, 8 => 2, 1, 9
        int[] array = {2, -1, 8};
        int[] sumArray = new int[array.length];
        sumArray = sumElements(array);

        for (int number : sumArray) {
            System.out.print(number + " ");
        }
    }

    private static int[] sumElements(int[] array) {
        int[] sumArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < i + 1; j++) {
                sum += array[j];
            }
            sumArray[i] = sum;
        }

        return sumArray;
    }
}
