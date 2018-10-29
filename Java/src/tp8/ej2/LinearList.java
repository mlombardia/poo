package tp8.ej2;

public interface LinearList<T> extends Iterable<T>{
    void add(T obj);
    T get(int i);
    void set(int i, T obj);
    void remove(int i);
    int indexOf(T obj);
    int size();
}
