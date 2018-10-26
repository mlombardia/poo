package tp7.ej6;

public interface AccessStack<E> extends Stack<E>{
    int getPushAccesses();
    int getPopAccesses();
}
