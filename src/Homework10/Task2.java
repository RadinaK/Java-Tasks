package Homework10;

class Range {
    int start;
    int end;
    int step;

    Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    boolean contains(int n) {
        return n >= start && n <= end;
    }

    boolean overlaps(Range r) {
        return contains(r.start) || contains(r.end);
    }

    boolean merge(Range r) {
        if (!overlaps(r)) {
            return false;
        }

        start = Math.min(r.start, start);
        end = Math.max(r.end, end);

        return true;
    }

    @Override
    public String toString() {
        return String.format("Range: %d - %d", start, end);
    }

//    int[][] mergeRanges(int[][] array) {
//        Range[] ranges = new Range[array.length];
//        for (int i = 0; i < ranges.length; i++) {
//            ranges[i] = new Range(array[i][0], array[i][1]);
//        }
//
//        int[][] newRanges;
//        int start = Integer.MAX_VALUE;
//        int end = Integer.MIN_VALUE;
//        for (int i = 0; i < ranges.length - 1; i++) {
//            if (ranges[i].merge(ranges[i + 1])) {
//                start = Math.min(ranges[i].start, start);
//                end = Math.max(ranges[i].end, end);
//            }
//        }
//
//        return null;
//    }

    int[][] mergeRanges(int[][] array) {
        Range[] ranges = new Range[array.length];
        for (int i = 0; i < ranges.length; i++) {
            ranges[i] = new Range(array[i][0], array[i][1]);
        }

        int[][] newRanges = new int[ranges.length][2];
        for (int i = 0; i < ranges.length - 1; i++) {
            Range r1 = ranges[i];
            Range r2 = ranges[i + 1];
            r1.merge(r2);
        }

        for (int i = 0; i < ranges.length - 1; i++) {
            newRanges[i][0] = ranges[i].start;
            newRanges[i][1] = ranges[i].end;
        }

        return newRanges;
    }
}

public class Task2 {
    public static void main(String[] args) {
//        Задача 2. сливане на припокриващи се интервали
//        да се напише функция mergeRanges която получава като параметър масив от масиви,
//        всеки от които описва числов интервл с 2 стойности - начало и край:
//
//          [[1, 5], [2, 4], [8, 12], [10, 13]]
//
//        функцията да връща масив с интервали, в който всички припокриващи се
//        или долепени1 интервали от входни масив са слети в нов интервал.
//
//          [[1, 5], [2, 4]] => [[1, 5]]
//          [[1, 5], [6, 8]] => [[1, 5], [6, 8]]
//          [[1, 5], [5, 6]] => [[1, 6]]
//          [[1, 5], [4, 7], [6, 8]] => [[1, 8]]

//        Range r1 = new Range(1, 3);
//        Range r2 = new Range(2, 5);
//        r1.merge(r2);
//        System.out.println(r1); // => [1, 5]
        int[][] array = {{1, 5}, {4, 7}, {6, 8}};
//        int[][] array = {{4, 7}, {6, 8}};
        System.out.println();

        Range range1 = new Range(1, 5);
        Range range2 = new Range(4, 7);
        Range range3 = new Range(6, 8);

        range1.mergeRanges(array);

//        int[][] newRanges = mergeRanges(array);


        System.out.println();
    }

//    public static int[][] mergeRanges(int[][] array) {
//        Range[] ranges = new Range[array.length];
//        for (int i = 0; i < ranges.length; i++) {
//            ranges[i] = new Range(array[i][0], array[i][1]);
//        }

//        int start = Integer.MAX_VALUE;
//        int end = Integer.MIN_VALUE;
//        for (int i = 0; i < ranges.length; i++) {
//            if (ranges[i].merge(ranges[i])) {
//                start = Math.min(ranges[i].start, start);
//                end = Math.max(ranges[i].end, end);
//            }
//        }
//        int[][] newRanges={{start, end}};

//        return newRanges;
//    }
}
