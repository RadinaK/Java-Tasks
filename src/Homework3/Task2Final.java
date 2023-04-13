package Homework3;

public class Task2Final {
    public static void main(String[] args) {
        String ipAddress = "255.255.255.255";
        long convertedNumber;
        convertedNumber = conversion(ipAddress);
        System.out.println(convertedNumber);
    }

    private static long conversion(String ipAddress) {
        String[] bytes = ipAddress.split("\\.");
        long result = 0;

        for (int i = 0; i < bytes.length; i++) {
            int byteN = Integer.parseInt(bytes[i]);
            long number = (long) Math.pow(256, bytes.length - 1 - i);
            result += number * byteN;
        }

        return result;
    }
}
