package Test2;

public class Task1 {
    public static void main(String[] args) {
//        Задача 1
//        Да се напише функция която получава като параметри два стринга и връща true ако двата стринга съдържат еднакви букви.
//        Забележки:
//        да не се ползват Set, Map или обекти
//        да няма директни или скрити вложени цикли
//        стринговете съдържат само малки латински букви
//        Пример:
//        "abc", "cba" => true
//        "abc", "ab" => false
//        "ababc", "abcccc" => true
        String s1 = "ababc";
        String s2 = "abcccc";
        System.out.println(isEqual(s1, s2));
    }

    static final int ALPHABET_START_INDEX = 97;
    static final int ALPHABET_LENGTH = 26;

    private static boolean isEqual(String s1, String s2) {
        int[] array1 = new int[ALPHABET_LENGTH];
        int[] array2 = new int[ALPHABET_LENGTH];

        addToArray(s1, array1);
        addToArray(s2, array2);

        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) {
                count++;
            }
        }

        if (count == ALPHABET_LENGTH) {
            return true;
        }

        return false;
    }

    private static void addToArray(String s, int[] array) {
        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);
            int asciiCode = symbol;

            array[asciiCode - ALPHABET_START_INDEX] = asciiCode;
        }
    }
}
