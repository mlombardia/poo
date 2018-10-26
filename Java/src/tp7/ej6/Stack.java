package tp7.ej6;

public interface Stack<E> {
    void push(E elem);
    E pop();
    boolean isEmpty();
    E peek();
}
