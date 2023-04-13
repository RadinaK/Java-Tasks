package Homework10;

public class Task3 {
    public static void main(String[] args) {
//        Задача 3. реверсиране на масив
//        да се напише функция reverse която получава като параметър масив със симвоили
//        и и го реверсираг, т.е. първия символ става последен, а последния първи,
//        втория - предпоследен а предпоследния втори и т.н.
//    Пример:
//        abc => cba
//        123 => 321
        char[] charArray1 = {'a', 'b', 'c'};
        char[] charArray2 = {'a', 'b', 'c', 'd'};
        char[] charArray = {'a', 'b', 'c', 'd', '6'};
        reverseArray(charArray);

        for (char c : charArray) {
            System.out.print(c);
        }
    }

    private static void reverseArray(char[] charArray) {
        int right = charArray.length - 1;
        for (int left = 0; left < charArray.length / 2; left++) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            right--;
        }
    }
}
