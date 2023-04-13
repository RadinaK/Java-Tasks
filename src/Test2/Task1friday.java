package Test2;

public class Task1friday {
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

    private static boolean isEqual(String s1, String s2) {
        int[] sArray1 = new int[s1.length()];
        int[] sArray2 = new int[s2.length()];

        addToArray(s1, sArray1);
        addToArray(s2, sArray2);

        boolean isEqual = false;

        if (sArray1.length == sArray2.length) {
            int count = 0;
            for (int i = 0; i < sArray1.length; i++) {
                if (sArray1[i] == sArray2[i]) {
                    count++;
                }
                if (count == sArray1.length) {
                    isEqual = true;
                }
            }
        }

        return false;
    }

    private static void addToArray(String s1, int[] sArray1) {
        for (int i = 0; i < s1.length(); i++) {
            char symbol = s1.charAt(i);

            if (i == 0 || symbol != sArray1[i - 1]) {
                sArray1[i] = symbol;
            }
        }
    }

}
