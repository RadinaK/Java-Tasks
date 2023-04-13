package Homework10.Task1;

public class Matrix {
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

    Matrix subMatrix(Range rows, Range columns) {
        int lengthRow = rows.end - rows.start + 1;
        int lengthColumn = columns.end - columns.start + 1;

        Matrix newMatrix = new Matrix(lengthRow, lengthColumn);
        for (int r = 0; r < lengthRow; r++) {
            for (int c = 0; c < lengthColumn; c++) {
                int r1 = r - rows.start;
                int c1 = c - columns.start;
                newMatrix.set(r, c, matrix[r1][c1]);
            }
        }

        return newMatrix;
    }
}
