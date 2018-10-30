package tp8.ej8;

@FunctionalInterface
public interface Criteria<T> {
    boolean satisfies(T obj);
}
