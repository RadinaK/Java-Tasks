package Homework8;

public class Task2 {
    public static void main(String[] args) {
//        Задача 2
//        да се разработи функция която получава като параметър стринг и число което
//        представлява позиция в стринга. функцията да връща нов стринг
//        в който елемента на съответната позиция е премахната.
//
//        да не се ползват вградени функции.
//                Пример:
//        "alabala", '2', "albala"
        String s = "alabala";
        int position = 5;
        System.out.println(removeCharAt(s, position));
    }

    private static String removeCharAt(String s, int position) {
        char[] chArray = new char[s.length() - 1];

        for (int i = 0; i <= position; i++) {
            char ch = s.charAt(i);
            chArray[i] = ch;
        }
        for (int i = position + 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            chArray[i - 1] = ch;
        }

        return String.valueOf(chArray);
    }
}
