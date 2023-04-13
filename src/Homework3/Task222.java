package Homework3;

public class Task222 {
    public static void main(String[] args) {
//        "255.255.255.255" => 4294967295
//        "0.0.0.1" => 1
//        "0.0.1.1" => 257
        String ipAddress = "0.0.1.1";
        long number=ipToLong(ipAddress);
    }

    public static long ipToLong(String ipAddress) {
        String[] ipAddressInArray = ipAddress.split("\\.");
        long result = 0;
        final int BASE = 256;
        int power = 3;

        for (String s : ipAddressInArray) {
            result += Integer.parseInt(s) * Math.pow(BASE, power);
            power--;
        }

        return result;
    }
}
