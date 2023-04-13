package Homework3;

import java.util.ArrayList;
import java.util.List;

public class Task22 {
    public static void main(String[] args) {
//        Задача 2. преобразуване на IP адрес към число
//        да се напише функция която получава като параметър стринг който преставлява IP адрес, например
//        255.255.255.255
//        да се напише функция която преобразува всяка група цифри в байт и връща число което се състои от съответните байтове
//        "255.255.255.255" => 4294967295
//        "0.0.0.1" => 1
//        "0.0.1.1" => 257
        String ipAddress = "0.0.0.1";
        int convertedNumber;
        convertedNumber = conversion(ipAddress);
        System.out.println(convertedNumber);
    }

    private static int conversion(String ipAddress) {
        String[] numbers = ipAddress.split("\\.");
        List<Integer> binaryList = new ArrayList<>();
        List<Integer> reversedList = new ArrayList<>();
        int convertedNum = 0;

        for (int i = 0; i < numbers.length; i++) {
            int count=0;
            int currentNumber = Integer.parseInt(numbers[i]);
            int currentBinary;

            if (currentNumber == 0) {
                binaryList.add(0);
                count++;
            } else {
                while (currentNumber != 0) {
                    if (currentNumber % 2 == 0) {
                        currentBinary = 0;
                        if (currentNumber == 0) {
                            binaryList.add(0);
                            count++;
                        }
                    } else {
                        currentBinary = 1;
                    }
                    currentNumber /= 2;
                    binaryList.add(currentBinary);
                    count++;
                }
            }
            if(count<8){
                for (int j = count; j <= 8-count; j++) {
                    binaryList.add(0);
                }
            }
        }

        for (int i = binaryList.size() - 1; i >= 0; i--) {
            reversedList.add(binaryList.get(i));
        }

/*
        int degree = reversedList.size() - 1;
        for (int i = 0; i < reversedList.size(); i++) {
            int currentNum = reversedList.get(i);
            int newNum = (int) (currentNum * (Math.pow(2, degree)));
            convertedNum += newNum;

            degree--;
        }
        */
        return convertedNum;
    }
}
