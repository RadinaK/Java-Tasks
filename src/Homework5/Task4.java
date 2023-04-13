package Homework5;

public class Task4 {
    public static void main(String[] args) {
//        Задача 4
//        да се разрзботи функция която получава като параметър два
//        подредени масива с числа и връща true
//        ако масивите съдържат еднакви числа, незвисимо от повторенията:
//
//        Пример:
//                [1, 1, 2, 3], [1, 2, 2, 2, 3] => true
//                [1, 2, 3, 3, 3], [2, 2, 2, 4] => false
        int[] array1 = {1, 1, 2, 3};
        int[] array2 = {1, 2, 2, 2, 3};

        System.out.println(isEqualNumbers(array1, array2));
    }

    static final int SINGLE_DIGIT_NUMBERS = 10;

//    private static boolean isEqualNumbers(int[] array1, int[] array2) {
//        int[] arr1 = new int[SINGLE_DIGIT_NUMBERS];
//        int[] arr2 = new int[SINGLE_DIGIT_NUMBERS];
//
//        addToArray(arr1, array1);
//        addToArray(arr2, array2);
//
//        for (int i = 0; i < SINGLE_DIGIT_NUMBERS; i++) {
//            if (arr1[i]!=arr2[i]){
//                return false;
//            }
//        }
//
//        return true;
//    }

    private static boolean isEqualNumbers(int[] array1, int[] array2) {
        if (array1[0] != array2[0]) {
            return false;
        }

        for (int i = 1; i < array1.length; i++) {
            if (array1[i] == array2[i]) {
                for (int j = i+1; j < array1.length; j++) {
                    if (array1[i] != array1[j]) {
                        break;
                    }
                    if (array2[i] != array2[j]) {
                        break;
                    }
                }
            }
        }

        return true;
    }

    private static void addToArray(int[] arr, int[] array) {
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            arr[element] = element;
        }
    }
}
