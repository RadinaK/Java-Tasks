package Test4;

public class Test {
    public static void main(String[] args) {
//        for(int i=0, j=7; i<j; i++,j--){
//            System.out.println(i^j);
//        }

        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int startIndex = 2;
        int endIndex = 5;
        reverse(array, startIndex, endIndex);
    }

    private static int[] reverse(int[] array, int startIndex, int endIndex) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < startIndex; i++) {
            reversedArray[i] = array[i];
        }
        for (int i = startIndex, j = endIndex; i <= endIndex; i++, j--) {
            int temp = array[i];
            reversedArray[i] = array[j];
            array[j] = temp;
        }
        for (int i = endIndex; i < array.length; i++) {
            reversedArray[i] = array[i];
        }
        System.out.println();
        return reversedArray;
    }
}
