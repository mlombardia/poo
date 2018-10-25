package tp6.ej9;

public interface LinearList {
    void add(Object obj);
    Object get(int i);
    void set(int i, Object obj);
    void remove(int i);
    int indexOf(Object obj);
    int size();
}
