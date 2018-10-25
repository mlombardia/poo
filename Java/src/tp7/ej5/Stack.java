package tp7.ej5;

public interface Stack<E> {
    void push(E elem);
    E pop();
    boolean isEmpty();
    E peek();
}
