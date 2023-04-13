package Homework9;

public class Test {
    public static void main(String[] args) {
        String s = "abcd56";
        String reversedString = recursion(s);
        System.out.println(reversedString);
    }

    private static String recursion(String s) {
        if (s.length() == 1) {
            return s;
        }
        else {
            String reverse = recursion(s.substring(1)) + s.charAt(0);
            return reverse;
        }
    }

}
