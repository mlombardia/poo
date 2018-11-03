package tp9.ej2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ConcatIterator<T> implements Iterator<T> {

    private Iterator<T> current;
    private Iterator<T> next;

    public ConcatIterator(Iterator<T> current, Iterator<T> next){
        this.current = current;
        this.next = next;
    }
    @Override
    public boolean hasNext() {
        if(!current.hasNext() && current != next)
            current = next;
        return current.hasNext();
    }

    @Override
    public T next() {
        if (!hasNext())
            throw new NoSuchElementException();
        return current.next();
    }
}
