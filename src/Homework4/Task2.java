package Homework4;

public class Task2 {
    public static void main(String[] args) {
//        Задача 2. includes
//        да се напише функция, която получава като параметър масив и проста стойност (число, boolean, стринг)
//        и връща true ако стойността се среща в масива, съответно false ако не присъства
//
//        Функцията да има незадължителен трети параметър който указва от коя позиция да започне търсенето
//        includes(searchElement)
//        includes(searchElement, fromIndex
//                Пример:
//        [1, 2, 3, 0, 12], 3 => true
//        [1, 2, 3, 0, 12], 1 => true
//        [1, 2, 3, 0, 12], 4 => false
        int[] array = {1, 2, 3, 0, 12};
        int searchElement = 3;
        int fromIndex = 0;
        System.out.println(includes(array, searchElement, fromIndex));
        System.out.println(includes(array, searchElement));
    }

    private static boolean includes(int[] array, int searchElement) {
        return includes(array, searchElement, 0);
    }

    private static boolean includes(int[] array, int searchElement, int fromIndex) {
        boolean isFound = false;

        for (int i = fromIndex; i < array.length; i++) {
            int element = array[i];
            if (element == searchElement) {
                isFound = true;
                break;
            }
        }

        return isFound;
    }
}
