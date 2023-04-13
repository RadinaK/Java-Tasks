package Homework7;

public class Task2 {
    public static void main(String[] args) {
//        Задача 2. сравнение на стрингове
//        да се напише функция която получава като параметър два стринга
//        и връща true ако двата стринга са еднакви при следните условия:
//
//        да не се вземат предвид допълнителните интервали
//        да не се вземат предвид голяма или малка буква
//        Пример:
//        "  abc  ", "abc" => true
//        "ABC", "abc" => true
//        " ala   bala", "ala bala" => true
//        " ала bala  ", "alabala" => false
        System.out.println(isEqual(" A BC", "abc"));
        System.out.println(isEqual("  abc  ", "abc"));
        System.out.println(isEqual(" ala   bala", "ala bala"));
        System.out.println(isEqual(" ала bala  ", "ala bala"));
    }

    static final int DIFFERANCE_BETWEEN_A_AND_a = 32;

    private static boolean isEqual(String s1, String s2) {
        StringBuilder sb1 = deleteSpaces(s1);
        StringBuilder sb2 = deleteSpaces(s2);

        if (sb1.length() != sb2.length()) {
            return false;
        }

        for (int i = 0; i < sb1.length(); i++) {
            char ch1 = sb1.charAt(i);
            char ch2 = sb2.charAt(i);

            int diff = Math.abs(ch1 - ch2);

            if (diff != 0 && diff != DIFFERANCE_BETWEEN_A_AND_a) {
                return false;
            }
        }

        return true;
    }

    private static StringBuilder deleteSpaces(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                sb.append(i);
            }
        }

        return sb;
    }
}
