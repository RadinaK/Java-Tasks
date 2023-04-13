package Homework6;

public class Task3 {
    public static void main(String[] args) {
//        Задача 3
//        Да се реши задача 2 от homework-1 по възможно най ефективен начин - без вложени цикли.
//        Задача 2
//        да се напише функция която получава като параметър 2 стринга.
//        като резултат да върне друг стринг съдържащ само
//        символите които се срещат едновременно и в двата входни стринга:
//        Пример:
//        "abc", "def" => ""
//        "abc", "cde" => "c"
//        "abc", "dafc" => "ac"
//        "abca", "deaf" => "a"
        String s1 = "abca";
        String s2 = "dafc";

        System.out.println(isContained(s1, s2));
    }

    static final int ALPHABET_LENGTH = 26;
    static final int ALPHABET_START_INDEX = 97;

    private static String isContained(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int[] array1 = createArray(s1);
        int[] array2 = createArray(s2);

        for (int i = 0; i < ALPHABET_LENGTH; i++) {
            if (array1[i] == array2[i] && array1[i] != 0) {
                sb.append((char) array1[i]);
            }
        }

        return sb.toString();
    }

    private static int[] createArray(String s) {
        int[] array = new int[ALPHABET_LENGTH];

        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);

            array[symbol - ALPHABET_START_INDEX] = symbol;
        }

        return array;
    }
}
