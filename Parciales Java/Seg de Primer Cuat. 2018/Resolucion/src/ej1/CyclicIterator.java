package ej1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CyclicIterator<T> implements Iterator<T> {

    private int count;
    private Iterable<T> collection;
    private Iterator<T> iterator;

    CyclicIterator(int count, Iterable<T> collection) {
        this.count = count;
        this.collection = collection;
        this.iterator = collection.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.collection.iterator().hasNext();
    }


    public T next() {
        List<T> res = new ArrayList<>();
        for(int i = 0; i < count; i++) {
            if(!iterator.hasNext()) {
                iterator = collection.iterator();
            }
            res.add(iterator.next());
        }
        return iterator.next();
    }
}
