package tp7.ej4;

public interface LinearList<T> {
    void add(T obj);
    T get(int i);
    void set(int i, T obj);
    void remove(int i);
    int indexOf(T obj);
    int size();
}
