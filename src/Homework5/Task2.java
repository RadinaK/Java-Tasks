package Homework5;

public class Task2 {
    public static void main(String[] args) {
//        Задача 2. indexOf
//        да се напише функция, която получава като параметри два сттринга s1 и s2
//        и връща число отговарящо на първата позиция s1 на която се s2.
//        в случай че стойността не е намерана да върне -1.
//
//        indexOf(s1, s2)
//        Функцията да има незадължителен трети параметър който указва от коя позиция да започне търсенето
//
//        indexOf(s1, s2, fromIndex)
//        Пример:
//
//        "ala bala", "la" => 1
//        "github", "hub" => 3
//        "microsoft", "google" => -1
        String s1 = "ala bala";
        String s2 = "la";
        int fromIndex = 2;

        System.out.println(indexOf(s1, s2));
        System.out.println(indexOf(s1, s2, fromIndex));
    }

    private static int indexOf(String s1, String s2) {
        return indexOf(s1, s2, 0);
    }

    private static int indexOf(String s1, String s2, int fromIndex) {
        StringBuilder sb = new StringBuilder(s2.length());

        for (int i = fromIndex; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(0);
            if (ch1 == ch2) {
                for (int j = i; j < i + s2.length(); j++) {
                    sb = new StringBuilder(sb.append(s1.charAt(j)));
                }
                if (sb.toString().equals(s2.toString())) {
                    return i;
                }
            }
        }

        return -1;
    }
}
