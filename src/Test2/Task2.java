package Test2;

public class Task2 {
    public static void main(String[] args) {
//        Задача 2
//        да се напише функция която получава като параметър стринг и връща boolen.
//        резулата да е true ако входния стринг е съставен от последователно пореден друг стринг.
//        Пример:
//        "abc" => false
//        "1212" => true
//        "alaala" => true
//        "alaal" => false
//        "zzzzz" => true
//        "acacac" => true
//        "acaca" => false
        String s = "alaala";
        System.out.println(isConsistent(s));
    }

    private static boolean isConsistent(String s) {
        StringBuilder sb1 = new StringBuilder(s);

        int count = 0;
        for (char symbol : sb1.toString().toCharArray()) {
            if (symbol == sb1.charAt(0)) {
                count++;
            }
        }
        if (count == sb1.length()) {
            return true;
        }

        sb1 = new StringBuilder(sb1.substring(0, sb1.length() / 2));
        StringBuilder sb2 = new StringBuilder(s.substring(s.length() / 2, s.length()));
        if (sb1.toString().equals(sb2.toString())) {
            return true;
        }

        return false;
    }
}
