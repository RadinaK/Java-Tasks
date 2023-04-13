package Homework3;

import java.util.ArrayList;
import java.util.List;


public class Task2222222 {
    public static void main(String[] args) {
//        Задача 2. преобразуване на IP адрес към число
//        да се напише функция която получава като параметър стринг който преставлява IP адрес, например
//        255.255.255.255
//        да се напише функция която преобразува всяка група цифри в байт и връща число което се състои от съответните байтове
//        "255.255.255.255" => 4294967295
//        "0.0.0.1" => 1
//        "0.0.1.1" => 257
        String ipAddress = "0.0.1.1";
        int convertedNumber;
        convertedNumber = conversion(ipAddress);
        System.out.println(convertedNumber);
    }

    private static int conversion(String ipAddress) {
        String[] numbers = ipAddress.split("\\.");
        List<Integer> reversedList = new ArrayList<>();
        int[] reversedArray1 = new int[8];
        int[] reversedArray2 = new int[8];
        int[] reversedArray3 = new int[8];
        int[] reversedArray4 = new int[8];
        int convertedNum = 0;

        reversedArray1 = fillArray(numbers[0]);
        reversedArray2 = fillArray(numbers[1]);
        reversedArray3 = fillArray(numbers[2]);
        reversedArray4 = fillArray(numbers[3]);
        System.out.println();

        for (int i = reversedArray1.length - 1; i >= 0; i--) {
            reversedList.add(reversedArray1[i]);
        }
        for (int i = reversedArray1.length - 1; i >= 0; i--) {
            reversedList.add(reversedArray2[i]);
        }
        for (int i = reversedArray1.length - 1; i >= 0; i--) {
            reversedList.add(reversedArray3[i]);
        }
        for (int i = reversedArray1.length - 1; i >= 0; i--) {
            reversedList.add(reversedArray4[i]);
        }

        int degree = reversedList.size() - 1;
        for (int i = 0; i < reversedList.size(); i++) {
            int currentNum = reversedList.get(i);
            int newNum = (int) (currentNum * (Math.pow(2, degree)));
            convertedNum += newNum;
            degree--;
        }

        return convertedNum;
    }

    private static int[] fillArray(String number) {
        int[] array1 = new int[8];

        for (int i = number.length() - 1; i >= 0; i--) {
            int currentNumber = Integer.parseInt(number);
            int currentBinary;

            if (currentNumber == 0) {
                array1[i] = 0;
            } else {
                while (currentNumber != 0) {
                    if (currentNumber % 2 == 0) {
                        currentBinary = 0;
                        if (currentNumber == 0) {
                            array1[i] = 0;
                        }
                    } else {
                        currentBinary = 1;
                    }
                    currentNumber /= 2;
                    array1[i] = currentBinary;
                }
            }
        }

        return array1;
    }
}

