package ar.edu.itba.poo.ej2;

import java.time.LocalDate;
import java.util.Iterator;

public class LocalDateInterval implements Iterable<LocalDate> {

    private LocalDate from;
    private LocalDate to;
    private int step;

    public LocalDateInterval(LocalDate from, LocalDate to, int step) {
        this.from = from;
        this.to = to;
        this.step = step;
    }

    @Override
    public Iterator<LocalDate> iterator() {
        return new LocalDateIntervalIterator();
    }

    private class LocalDateIntervalIterator implements Iterator<LocalDate> {

        private LocalDate current = from;

        @Override
        public boolean hasNext() {
            return !current.plusDays(step).isAfter(to);
        }

        @Override
        public LocalDate next() {
            return current = current.plusDays(step);
        }

    }

}
