package Test4;

class Matrix {
    int rows = 0;
    int columns = 0;
    int defaultValue;
    int[][] matrix;

    Matrix(int rows, int columns) {
        this(rows, columns, 0);
    }

    Matrix(int rows, int columns, int defaultValue) {
        this.rows = rows;
        this.columns = columns;
        this.defaultValue = defaultValue;
        matrix = new int[rows][columns];

        fill(defaultValue);
    }

    void fill(int value) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                matrix[r][c] = value;
            }
        }
    }

    void clear() {
        this.fill(0);
    }

    int[] getRow(int row) {
        int[] currentRow = new int[columns];

        for (int c = 0; c < matrix[row].length; c++) {
            currentRow[c] = matrix[row][c];
        }

        return currentRow;
    }

    int[] getColumn(int col) {
        int[] currentCol = new int[rows];

        for (int r = 0; r < rows; r++) {
            currentCol[r] = matrix[r][col];
        }

        return currentCol;
    }

    void set(int x, int y, int value) {
        matrix[x][y] = value;
    }

    int get(int x, int y) {
        return matrix[x][y];
    }
}

public class Task1Final {
    public static void main(String[] args) {
//        Задача 1. subMatrix
//        да се разработи клас Matrix който представлява двумерна матрица с цели числа
//        да бъдат разработени следните методи:
//
//          Matrix(rows, columns) - конструктор, като columns и rows са съответно
//        броя редове и колони в матрицата. първоначално всички стойности на елментите са 0
//
//          Matrix(rows, columns, default) - конструктор, като columns и rows са съответно
//        броя редове и колони в матрицата, като запълва матрицата със стойността на default
//
//          void fill(value) - всички елменти на матрицата приемат стойността value
//
//          void clear() - всички елменти на матрицата стават 0
//
//          int[] getRow(row) - връща като едномререн масив елементите от съответния ред
//
//          int[] getColumn(col) - връща като едномререн масив елементите от съответната колона
//
//          void set(x, y, value) - записва стойност на координати x, y в матрицата
//
//          int get(x, y) - връща стойността на координати x, y
//
//          String toString() - превръща матрицата в стринг
//        Matrix matrix1 = new Matrix(2, 3);
        Matrix matrix2 = new Matrix(2, 3, 6);

        matrix2.fill(9);
//        matrix2.clear();
        matrix2.getRow(1);
        matrix2.getColumn(1);

        matrix2.set(1, 0, 1);
        int num = matrix2.get(1, 0);
    }
}
