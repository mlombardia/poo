package tp7.ej6;

public class ArrayAccessStack<E> extends ArrayStack<E> implements AccessStack<E>{

    private int popAccesses;

    public ArrayAccessStack(){
        super();
    }

    @Override
    public E pop(){
        E toReturn = super.pop();
        popAccesses++;
        return toReturn;
    }

    @Override
    public int getPushAccesses() {
        return popAccesses + dim;
    }

    @Override
    public int getPopAccesses() {
        return popAccesses;
    }
}
