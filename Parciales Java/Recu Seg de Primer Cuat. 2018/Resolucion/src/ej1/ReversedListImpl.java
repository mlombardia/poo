package ej1;

import java.util.ArrayList;
import java.util.Iterator;

public class ReversedListImpl<T> extends ArrayList<T> implements ReversedList<T> {

    @Override
    public Iterator<T> defaultIterator() {
        return super.iterator();
    }

    @Override
    public Iterator<T> iterator(){
        return new ReversedIterator();
    }

    private class ReversedIterator implements Iterator<T> {
        private int current;

        @Override
        public boolean hasNext() {
            return current < size();
        }

        @Override
        public T next() {
            current++;
            return get(size() - current);
        }
    }
}
