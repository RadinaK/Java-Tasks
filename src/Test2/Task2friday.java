package Test2;

public class Task2friday {
    public static void main(String[] args) {
//        "abc" => false
//        "1212" => true
//        "alaala" => true
//        "alaal" => false
//        "zzzzz" => true
//        "acacac" => true
//        "acaca" => false
        String s = "acacac";
        System.out.println(isConsistent(s));
    }

    private static boolean isConsistent(String s) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        boolean isEqual = false;

        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);

            sb1.append(symbol);

            if (sb1.length() > 1) {
                sb2 = new StringBuilder(sb1.substring(sb1.length() / 2, sb1.length()));
            }
        }

        int count = 0;
        for (int i = 0; i < sb1.length(); i++) {
            char symbol = sb1.charAt(0);

            if (symbol == sb1.charAt(i)) {
                count++;
            }

            if (count == sb1.length()) {
                return true;
            }
        }
        String newSB = sb1.substring(0, sb1.length() / 2);
        sb1 = new StringBuilder(newSB);
        if (sb1.toString().equals(sb2.toString())) {
            return true;
        }

        return isEqual;
    }
}

