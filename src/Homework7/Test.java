package Homework7;

public class Test {
    public static void main(String[] args) {
        String s1 = "аla  bala";
        String s2 = "ala bala";
        System.out.println(compareStrings(s1, s2));
    }
    public static boolean compareStrings(String s1, String s2) {
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        int i = 0, j = 0;
        while (true) {
            if (ch1[i] != ch2[i]) {
                break;
            }
        }
        if(ch1[i] == ch2[i]) {
            return true;
        }
        else if(ch1[i] < ch2[i]) {
            System.out.println("smaller");
        }
        return false;
    }
}
