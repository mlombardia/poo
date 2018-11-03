package tp9.ej1;

import java.util.Iterator;

public class PairCyclicIterator<T> implements Iterator<Pair<T>> {

    private Iterable<T> collection;
    private Iterator<T> iterator;

    public PairCyclicIterator(Iterable<T> collection){
        this.collection = collection;
        iterator = collection.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.collection.iterator().hasNext();
    }

    @Override
    public Pair<T> next() {
        T left, right;
        if(!iterator.hasNext()){
            iterator = collection.iterator();
        }
        left = iterator.next();
        if(!iterator.hasNext()){
            iterator = collection.iterator();
        }
        right = iterator.next();
        return new Pair<>(left,right);
    }
}
