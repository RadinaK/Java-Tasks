package Homework3;

public class Task1 {
    public static void main(String[] args) {
//        Задача 1. форматиране на IP адрес
//        да се напише функция която получава като параметър число от тип long. функията да връща стринг от тип:
//        xxx.yyy.zzz.aaa
//        където вяка група цифри представлява съответния байт от зададеното число
//        да са включени само последните 4 байта, т.е стринга да има 4 групи цифри
//        диапазона на числата във всяка група е 0-255
//        long number=4294967295;
//        long number = 255;
//        String string = returnString(number);
        System.out.println(returnString(429496729));
    }

    private static String returnString(long number) {
        long[] ipArray = new long[4];

        for (int i = 0; i < 4; i++) {
            ipArray[i] = number % 256;
            number /= 256;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            sb.append(ipArray[i]);
            sb.append(".");
        }
        sb.replace(sb.length()-1, sb.length(), "");
        System.out.println();

        return sb.toString();
    }
}
