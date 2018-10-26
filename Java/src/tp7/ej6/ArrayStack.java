package tp7.ej6;

import tp7.ej5.Stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack<E> implements Stack<E>{

    protected E[] elements;
    protected static final int INITIAL_DIM = 10;
    protected int dim;

    @SuppressWarnings("unchecked")
    public ArrayStack(){
        elements = (E[]) new Object[INITIAL_DIM];
    }

    @Override
    public void push(E elem) {
        if(dim == elements.length)
            resize();
        elements[dim++] = elem;
    }

    @Override
    public E pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return elements[--dim];
    }

    @Override
    public boolean isEmpty() {
        return dim == 0;
    }

    @Override
    public E peek() {
        return elements[dim - 1];
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder("[");
        for(int i = dim - 1; i>=0; i--){
            stringBuilder.append(elements[i]).append(",");
        }
        stringBuilder.setCharAt(stringBuilder.length() - 1, ']');
        return stringBuilder.toString();
    }

    private void resize(){
        elements = Arrays.copyOf(elements, elements.length + INITIAL_DIM);
    }
}
