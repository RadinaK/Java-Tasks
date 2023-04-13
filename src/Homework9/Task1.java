package Homework9;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {
//        Задача 1.
//        Да се напише функция която получава като параметри два стринга
//        и връща true ако двата стринга съдържат еднакви букви.
//
//   Пример:       "abc", "cba" => true
//                 "abc", "ab" => false
//                 "ababc", "abcccc" => true
        String s1 = "ababc";
        String s2 = "bcccca";
        System.out.println(isEqual(s1, s2));
    }

    private static boolean isEqual(String s1, String s2) {
        Set<Character> set1 = getUniques(s1);
        Set<Character> set2 = getUniques(s2);

        return set1.equals(set2);
    }

    private static Set<Character> getUniques(String s) {
        Set<Character> set = new TreeSet<>();

        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        return set;
    }
}
