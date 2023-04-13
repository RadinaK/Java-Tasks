package Homework8;

public class Task3 {
    public static void main(String[] args) {
//        Задача 3
//        да се разработи функция която получава като параметър стринг и два символа ch1 и ch2.
//        функцията да връща нов стринг в който ch1 е заменен с ch2.
//
//        Пример:   "alabala", 'a', 'c' => "clcbclc"
        String s = "alabala";
        char ch1 = 'a';
        char ch2 = 'c';
        System.out.println(swapCharacters(s, ch1, ch2));
    }

    private static String swapCharacters(String s, char ch1, char ch2) {
        char[] chArray = s.toCharArray();

        for (int i = 0; i < chArray.length; i++) {
            if (chArray[i] == ch1) {
                chArray[i] = ch2;
            }
        }

        return String.valueOf(chArray);
    }
}
