package Homework6;

public class Test {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 3, 4, 4, 5, 5};
        int[] modifiedArray = removeDup(array);

        for (int element : modifiedArray) {
            System.out.print(element + " ");
        }


    }

    private static int[] removeDup(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && (i != j)) {
                    arr1[i]=arr[i];
                }
            }
        }

        return arr1;
    }
}
