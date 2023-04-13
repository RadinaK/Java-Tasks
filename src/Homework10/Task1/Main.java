package Homework10.Task1;


public class Main {
    public static void main(String[] args) {
//        Задача 1. subMatrix
//        към класа Matrix да се добави метод subMatrix със два параметъра columns и rows от тип Range.
//        метода да връща нова матрица, която представлява подматрица според индексите в columns и rows.
//
//        Пример:
//
//
//// 1 0 0 0
//// 0 2 0 0
//// 0 0 3 0
//// 0 0 0 4
//
        Matrix m = new Matrix(4, 4);
        for (int i = 0; i < 4; i++) {
            m.set(i, i, i + 1);
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(m.get(i, j) + " ");
            }
            System.out.println();
        }


        Range columns = new Range(1, 2);
        Range rows = new Range(2, 3);
        Matrix m2 = m.subMatrix(rows, columns);
        System.out.println(m2);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(m2.get(i, j) + " ");
            }
            System.out.println();
        }
    }
}
