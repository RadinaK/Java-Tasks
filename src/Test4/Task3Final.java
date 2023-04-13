package Test4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Task3Final {
    public static void main(String[] args) {
//        Задача 3
//        да се напише функцият коато получава като параметър стринг съдържащ
//        букви и цифри и връща стринг, който съдържа символите от входния подредени така че:
//
//        буква да не може да следва друга буква, съответно цифра да не може да следва друга цифра
//        буквите, както и цифрите да са в първоначалната си подредба
//        ако не е възможно такова подрежане функцията да върне празен стринг
//
//        Пример:
//
//        "abc133d" => "a1b2c3d"
//        "alabala"
//        String s = "abc133d";
        String s = "1abc23d45";
        System.out.println(modifyString(s));
    }

    private static String modifyString(String s) {
        List<Character> ch1 = new ArrayList<>();
        List<Character> ch2 = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);

            if (Character.isDigit(symbol)) {
                ch2.add(symbol);
            } else {
                ch1.add(symbol);
            }
        }

        int diff = Math.abs(ch1.size() - ch2.size());
        if (diff > 1) {
            return "";
        }

        char firstSymbol = s.charAt(0);
        int minSize = Math.min(ch1.size(), ch2.size());
        if (Character.isDigit(firstSymbol) && minSize == ch2.size() ||
                Character.isAlphabetic(firstSymbol) && minSize == ch1.size()) {
            return "";
        }

        StringBuilder modifiedString = new StringBuilder(s.length());

        if (Character.isDigit(firstSymbol)) {
            List<Character> temp = ch2;
            ch2 = ch1;
            ch1 = temp;
        }

        for (int i = 0; i < ch2.size(); i++) {
            modifiedString.append(ch1.get(i));
            modifiedString.append(ch2.get(i));
        }

        if (diff != 0) {
            modifiedString.append(ch1.get(ch1.size() - 1));
        }

        return modifiedString.toString();
    }
}

