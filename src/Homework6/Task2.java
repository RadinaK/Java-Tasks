package Homework6;

public class Task2 {
    public static void main(String[] args) {
//        Задача 2
//        да се напише функция която приема като параметър стринг и връща стринг.
//        входния стринг може да съдръжа символа # който служи като символ за изтриване на предходния символ.
//        функцията да връща оригиналния стринг върху който са приложени всички операции за изтриване.
//                Пример:
//        "abc#" => "ab"
//        "a#bc" => "bc"
//        "abc##" => "a"
//        "a##bc" => "bc"
        String s = "abc##";
        System.out.println(modifiedString(s));
    }

    private static String modifiedString(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == '#') {
                if (i == 0) {
                    sb = new StringBuilder(sb.deleteCharAt(i));
                    i--;
                } else {
                    sb = new StringBuilder(sb.delete(i - 1, i + 1));
                    i -= 2;
                }
            }
        }

        return sb.toString();
    }
}
