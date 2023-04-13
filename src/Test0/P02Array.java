package Test0;

public class P02Array {
    public static void main(String[] args) {

        int[] array = {2, 3, 59, 7, 11, 13};

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println(max);

    }
}
