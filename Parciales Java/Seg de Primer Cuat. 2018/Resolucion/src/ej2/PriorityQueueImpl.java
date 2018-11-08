package ej2;

import java.util.*;

public class PriorityQueueImpl<E> implements PriorityQueue<E>{

    private TreeSet<PriorityQueueElement<E>> elements = new TreeSet<>();
    private int elementCount;

    @Override
    public void enqueue(E element, int priority) {
        elements.add(new PriorityQueueElement<>(element, priority, elementCount++));
    }

    @Override
    public E dequeue() {
        Iterator<PriorityQueueElement<E>> aux = elements.iterator();
        PriorityQueueElement<E> pqElement = aux.next();
        aux.remove();
        return pqElement.getElement();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public int size(int priority) {
        int count = 0;
        for(PriorityQueueElement<E> priorityQueueElement : elements){
            if(priorityQueueElement.getPriority() == priority){
                count++;
            }
            if (priorityQueueElement.getPriority() > priority){
                break;
            }
        }
        return count;
    }
}
