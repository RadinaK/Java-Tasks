package Test0;

import java.util.Scanner;

public class P01Sum1N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());;

        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
