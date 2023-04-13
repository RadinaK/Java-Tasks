package Homework4;

public class Demo {
        public static void main(String[] args) {
            int arr1[] = {1, 3, 2, 9, 6};
            System.out.println(arrS(arr1, 2));
        }
        /**
         *
         * @param arr
         * @param n
         * @return
         */
        public static boolean arrS(int arr[], int n) {
            for (int i =0; i < arr.length; i++) {
                if (n == arr[i]) {
                    return true;
                }
            }
            return false;
        }
    }
