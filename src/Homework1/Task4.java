package Homework1;

public class Task4 {
    public static void main(String[] args) {
        //System.out.println(arr);
        int arr[] = {1, 3, 1, 2, 5, 2, 1, 3};
    }

    public static int arrSort(int arr[]) {
        int i = arr.length - 1;
        if (arr.length == 0) {
            return 0;
        }
        while (i >= 0) {
            arr[i + 1] = arr[i];
            i--;
        }
        for (int x : arr)
            System.out.println(x);
        return 0;
    }
}

