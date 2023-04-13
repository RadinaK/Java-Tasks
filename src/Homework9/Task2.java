package Homework9;

public class Task2 {
    public static void main(String[] args) {
//        Задача 2. реверсиране на стринг
//        да се напише функция reverse която получава като параметър стринг
//        и връща реверсиран входния стринг, т.е. първия символ става последен,
//        а последния първи, втория - предпоследен а предпоследния втори и т.н.
//
//                вместо цикъл да се ползва рекурсия
//        Пример:       abc => cba
//                      123 => 321
        String s = "12345";
        String reversedString = reverseArray(s, 0, s.length() - 1);
        System.out.println(reversedString);
    }

    static String reverseArray(String s, int start, int end) {
        char[] chArray = s.toCharArray();
        if (start == end) {
            return s.charAt(start) + "";
        }

        int temp = chArray[start];
        chArray[start] = chArray[end];
        chArray[end] = (char) temp;
        reverseArray(String.valueOf(chArray), start + 1, end - 1);

        return String.valueOf(chArray);
    }
}
