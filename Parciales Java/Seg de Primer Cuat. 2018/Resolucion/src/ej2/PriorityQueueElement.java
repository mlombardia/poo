package ej2;

public class PriorityQueueElement<E> implements Comparable<PriorityQueueElement> {

    private E element;
    private int priority;
    private int elementCount;

    public PriorityQueueElement(E element, int priority, int elementCount){
        this.element = element;
        this.priority = priority;
        this.elementCount = elementCount;
    }

    @Override
    public int compareTo(PriorityQueueElement o) {
        int priorityCmp = this.priority - o.priority;
        if(priorityCmp !=0){
            return priorityCmp;
        }
        return this.elementCount - o.elementCount;
    }

    public E getElement(){
        return element;
    }

    public int getPriority(){
        return priority;
    }
}
