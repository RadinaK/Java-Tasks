package Homework1;

public class Task2 {

    public static void main(String[] args) {
        String firstString = "abcaf";
        String secondString = "defab";
        System.out.println(ifEqual(firstString, secondString));
    }

    private static String ifEqual(String firstString, String secondString) {
        String result = "";
        StringBuilder firstBuilder = new StringBuilder(firstString);
        StringBuilder secondBuilder = new StringBuilder(secondString);

        for (int i = 0; i < firstBuilder.length(); i++) {
            char firstSymbol = firstBuilder.charAt(i);
            for (int j = 0; j < secondBuilder.length(); j++) {
                char secondSymbol = secondBuilder.charAt(j);
                if (firstSymbol == secondSymbol) {
                    result += firstSymbol;
                    firstBuilder = firstBuilder.deleteCharAt(i);
                    secondBuilder = secondBuilder.deleteCharAt(j);
                    i--;
                    j--;
                }
            }
        }
        return result;
    }
}
