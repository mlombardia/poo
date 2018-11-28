package Ej2;

import java.util.HashMap;
import java.util.Map;

public class DoubleKeyHashMap<K1,K2,V> implements DoubleKeyMap<K1,K2,V> {
    private Map<K1, Map<K2, V>> personMap = new HashMap<>();

    @Override
    public int size() {
        int size = 0;
        for(K1 key: personMap.keySet()){
            size += personMap.get(key).size();
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return personMap.isEmpty();
    }

    @Override
    public boolean containsKey(K1 firstKey, K2 secondKey) {
        if (personMap.containsKey(firstKey))
            return personMap.get(firstKey).containsKey(secondKey);
        return false;
    }

    @Override
    public boolean containsValue(V value) {
        for (K1 key:personMap.keySet()) {
            if (personMap.get(key).containsValue(value))
                return true;
        }
        return false;
    }

    @Override
    public V get(K1 firstKey, K2 secondKey) {
        return personMap.get(firstKey).get(secondKey);
    }

    @Override
    public void put(K1 firstKey, K2 secondKey, V value) {
        if (!personMap.containsKey(firstKey))
            personMap.put(firstKey, new HashMap<>());
        if(!(personMap.get(firstKey).containsKey(secondKey)))
            personMap.get(firstKey).put(secondKey,value);
        personMap.get(firstKey).remove(secondKey);
        personMap.put(firstKey, new HashMap<>());
        personMap.get(firstKey).put(secondKey, value);
    }
}
