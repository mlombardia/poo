package tp9.ej5;

import tp8.ej7.BagImpl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public class IterableBagImpl<T extends Comparable<? super T>> extends BagImpl<T> implements IterableBag<T>{

    public IterableBagImpl(){
        bag = new TreeMap<>(Comparator.reverseOrder());
    }

    @Override
    public Iterable<T> elements() {
        List<T> elements = new ArrayList<>();
        for(T elem : bag.keySet()){
            for(int i = 0; i < bag.get(elem); i++){
                elements.add(elem);
            }
        }
        return elements;
    }

    @Override
    public Iterable<T> elementsDistinct() {
        return bag.keySet();
    }
}
