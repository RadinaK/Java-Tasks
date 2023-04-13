package Homework4;

public class Task4 {
    public static void main(String[] args) {
//        Задача 4. unshift
//        да се напише функция, която получава като параметър масив и някаква стойност. 
//        да се добави стойнстта на първа позиция, като висчки елеметнти се изместват с 1 позиция надясно
//
//        Пример:
//      [1, 2, 3, 0, 12] <= 1, [2, 3, 0, 12]
//      [] => undefined
        int[] array = {2, 3, 0, 12};
        int element = 1;
        int[] arrayWithoutFE = addFirstElement(array, element);

        for (int number : arrayWithoutFE) {
            System.out.print(number + " ");
        }
    }

    private static int[] addFirstElement(int[] array, int element) {
        if (array.length == 0) {
            return new int[0];
        }

        int[] arrayWithNewElement = new int[array.length + 1];
        arrayWithNewElement[0] = element;

        for (int i = 0, j = 1; i < array.length; i++, j++) {
            arrayWithNewElement[j] = array[i];
        }

        return arrayWithNewElement;

    }
}
