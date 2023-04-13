package Test4;

public class Task3 {
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
        String s = "abc133d";
        System.out.println(modifyString(s));
    }

    public static final int ALPHABET_LENGTH = 26;

    private static String modifyString(String s) {
        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);
            if (symbol >= 'a' && symbol <= 'z') {
                letters.append(symbol);
            } else if (symbol >= '0' && symbol <= '9') {
                digits.append(symbol);
            }
        }

        if (letters.length() > digits.length() + 1 || digits.length() > letters.length() + 1) {
            return "";
        }

        StringBuilder modifiedString = new StringBuilder(s.length());
        char firstSymbol = s.charAt(0);
        char l1 = letters.charAt(0);
        char d1 = digits.charAt(0);

        if (firstSymbol == letters.charAt(0)) {
            modifiedString.append(firstSymbol);
//            letters.deleteCharAt(0);
        } else if (firstSymbol == digits.charAt(0)) {
            modifiedString.append(firstSymbol);
//            digits.deleteCharAt(0);
        }

        for (int i = 1; i < modifiedString.length(); i++) {
            if (modifiedString.charAt(i) == letters.charAt(i - 1)) {
                modifiedString.append(digits.charAt(0));
                digits.deleteCharAt(0);
            } else {
                modifiedString.append(letters.charAt(0));
                letters.deleteCharAt(0);
            }
        }


        return modifiedString.toString();
    }
}
