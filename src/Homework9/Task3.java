package Homework9;

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
}

public class Task3 {
    public static void main(String[] args) {
//        Задача 3. Range
//        да се разработи клас Range който представлява интервал между 2 числа със следните методи:
//
//        Range(start, end, step) - конструктор
//        start и end определят началто и края на периода
//        step е незадължителен параметър който се ползва при итериране на стойностите в диапазона

//        contains(n) - връща true ако числото n се съдържа в текущия интервал
//        overlaps(r) - връща true ако r се застъпва с текущия интервал
//        merge(r) - слива r с текущия интервал ако се застъпват. функцият връща true ако сливанеот е успешно
//
//        класа Range да е iterable.
//
//                Пример:
//        Range r1 = new Range(1, 3);
//        Range r2 = new Range(2, 5);
//        r1.merge(r2);
//        System.out.println(r1); // => [1, 5]

        Range r1 = new Range(1, 3);
        Range r2 = new Range(2, 5);

        System.out.println(r1.contains(2));

        System.out.println(r2.overlaps(r1));

        r1.merge(r2);
        System.out.println(r1.toString());
    }
}
