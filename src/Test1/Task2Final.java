package Test1;

import java.util.ArrayList;
import java.util.List;

public class Task2Final {
    public static void main(String[] args) {
        int[] array = {1, 3, 1, 3, 16, 5, 16};
        int[] arrayWithoutRepetitions = getUniques(array);

        for (int element : arrayWithoutRepetitions) {
            if (element != 0) {
                System.out.print(element + " ");
            }
        }
    }

    private static int[] getUniques(int[] array) {
        int[] result = new int[array.length];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            int arrayNum = array[i];
            for (int j = 0; j < result.length; j++) {
                if (i == 0) {
                    result[0] = array[0];
                    break;
                }
                int duplicatedNum = result[j];
                if (arrayNum != duplicatedNum && duplicatedNum != 0) {
                    if (!list.contains(arrayNum)) {
                        result[i] = arrayNum;
                        list.add(arrayNum);
                    }
                    break;
                }
            }
        }
        return result;
    }
}
