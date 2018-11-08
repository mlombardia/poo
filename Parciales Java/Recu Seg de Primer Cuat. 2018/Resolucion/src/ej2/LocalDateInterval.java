package ej2;

import java.time.LocalDate;
import java.util.Iterator;

public class LocalDateInterval implements Iterable<LocalDate> {

    private LocalDate start;
    private LocalDate end;
    private int steps;

    public LocalDateInterval(LocalDate start, LocalDate end, int steps) {
        this.start = start;
        this.end = end;
        this.steps = steps;
    }

    @Override
    public Iterator<LocalDate> iterator() {
        return new LocalDateIterator();
    }

    private class LocalDateIterator implements Iterator<LocalDate> {

        private LocalDate current = start;

        @Override
        public boolean hasNext() {
            return !current.plusDays(steps).isAfter(end);
        }

        @Override
        public LocalDate next() {
            return current = current.plusDays(steps);
        }
    }
}
