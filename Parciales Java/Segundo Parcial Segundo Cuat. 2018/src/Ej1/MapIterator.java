package Ej1;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public class MapIterator<K,V> implements Iterator<K> {
    private Map<K,V> map;
    private Iterator<K> iterator;
    private K current;

    public MapIterator(Map<K, V> map) {
        this.map = map;
        this.iterator = map.keySet().iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public K next() {
        current = iterator.next();
        return current;
    }

    public V getValue() {
        return map.get(current);
    }
}
