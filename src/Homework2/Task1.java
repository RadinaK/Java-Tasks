package Homework2;

public class Task1 {
    public static void main(String[] args) {
//        Задача 1 - реверсиране на масив
//        да се напише функция която получава масив от числа, която го преподрежда така че първото число отива най отзад,
//        второто става предспоследно и т.н.
//                Пример:
//        1, 2, 3, 4 => 4, 3, 2, 1
        int[] array = {1, 2, 3, 4};
        int[] reversedArray = new int[array.length];
        reversedArray = reverseArray(array);

        for (int number : reversedArray) {
            System.out.print(number + " ");
        }
    }

    private static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = array[i];
        }

        return reversedArray;
    }
}
