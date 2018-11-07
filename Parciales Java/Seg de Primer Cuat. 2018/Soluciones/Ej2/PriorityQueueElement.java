package ej2;

public class PriorityQueueElement<E> implements Comparable<PriorityQueueElement<E>> {

    private E element;
    private int priority;
    private int elementCount;

    public PriorityQueueElement(E element, int priority, int elementCount) {
        this.element = element;
        this.priority = priority;
        this.elementCount = elementCount;
    }

    @Override
    public int compareTo(PriorityQueueElement<E> o) {
        int priorityCmp = priority - o.priority;
        if(priorityCmp != 0) {
            return priorityCmp;
        }
        return elementCount - o.elementCount;
    }

    public E getElement() {
        return element;
    }

    public int getPriority() {
        return priority;
    }

}
