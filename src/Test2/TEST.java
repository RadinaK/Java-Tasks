package Test2;

public class TEST {
    public static void main(String[] args) {
        System.out.println(test("abc"));
        System.out.println(test("1212"));
        System.out.println(test("alaala"));
        System.out.println(test("acacac"));
    }
    public static boolean test(String s1) {
        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) == s1.charAt(0) || i != 0 ) {
                if(s1.substring(0, i).equals(s1.substring(i, s1.length()))) {
                    return true;
                }
            }
        }
        return false;
    }
}
