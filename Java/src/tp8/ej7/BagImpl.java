package tp8.ej7;


import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class BagImpl<T> implements Bag<T>{

    private Map<T,Integer> bag= new HashMap<>();

    @Override
    public void add(T elem) {
        if(!bag.containsKey(elem)) {
            bag.put(elem, 1);
        }else{
            bag.put(elem, bag.get(elem) + 1);
        }

    }

    @Override
    public int count(T elem) {
        if(!bag.containsKey(elem))
            return 0;
        return bag.get(elem);
    }

    @Override
    public int size() {
        int size=0;
        for(int value : bag.values()){
            size += value;
        }
        return size;
    }

    @Override
    public int sizeDistinct() {
        return bag.size();
    }

    @Override
    public boolean contains(T elem) {
        return bag.containsKey(elem);
    }

    @Override
    public void remove(T elem) {
        if(!bag.containsKey(elem))
            throw new NoSuchElementException();
        if(bag.get(elem) == 1){
            bag.remove(elem);
        }else{
            bag.put(elem, bag.get(elem) - 1);
        }
    }
}
