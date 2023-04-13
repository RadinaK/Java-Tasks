package Homework10.Task1;

public class Range {
    int start;
    int end;
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

