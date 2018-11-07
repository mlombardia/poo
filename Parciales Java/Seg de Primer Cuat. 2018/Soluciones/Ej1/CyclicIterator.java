package ej1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CyclicIterator<E> implements Iterator<Iterable<E>> {

    private int count;
    private Iterable<E> collection;
    private Iterator<E> iterator;

    CyclicIterator(int count, Iterable<E> collection) {
        this.count = count;
        this.collection = collection;
        this.iterator = collection.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.collection.iterator().hasNext();
    }

    @Override
    public List<E> next() {
        List<E> res = new ArrayList<>();
        for(int i = 0; i < count; i++) {
            if(!iterator.hasNext()) {
                iterator = collection.iterator();
            }
            res.add(iterator.next());
        }
        return res;
    }

}
