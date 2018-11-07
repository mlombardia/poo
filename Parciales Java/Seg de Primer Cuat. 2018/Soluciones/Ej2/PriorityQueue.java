package ej2;

public interface PriorityQueue<E> {

    /** Agrega el elemento */
    void enqueue(E element, int priority);

    /** Remueve y retorna el elemento con mayor prioridad */
    E dequeue();

    /** Indica si la cola de prioridad está vacía */
    boolean isEmpty();

    /** Devuelve la cantidad de elementos encolados */
    int size();

    /** Devuelve la cantidad de elementos encolados con la prioridad indicada */
    int size(int priority);

}
