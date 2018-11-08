package ej2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PriorityQueueImpl<E> implements PriorityQueue<E>{

    Map<Integer, List<E>> queue = new TreeMap<>();

    @Override
    public void enqueue(E element, int priority) {
        if (queue.containsKey(priority)){
            queue.get(priority).add(element);
        }else{
            queue.put(priority, new ArrayList<>());
        }
    }

    @Override
    public E dequeue() {
        return queue.get(1).get(1);
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public int size(int priority) {
        return queue.get(priority).size();
    }
}
