package Homework1;

public class Task1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("github");
            } else if (i % 3 == 0) {
                System.out.println("git");
            } else if (i % 5 == 0) {
                System.out.println("hub");
            } else {
                System.out.println(i);
            }
        }
    }
}
