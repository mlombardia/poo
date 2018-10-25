package tp7.ej4;

public class PrependLinearListImpl<T> implements LinearList<T>{
    private Node first;

    @Override
    public void add(T obj) {
        first = new Node(obj);
    }

    @Override
    public T get(int i) {
        Node current = findNode(i);
        return current.head;
    }

    @Override
    public void set(int i, T obj) {
        Node current = findNode(i);
        current.head = obj;
    }

    @Override
    public void remove(int i) {
        if(i<0 || first == null){
            throw new IndexOutOfBoundsException();
        }
        if(i == 0){
            first = first.tail;
        }else{
            Node previous = findNode(i-1);
            if(previous.tail == null){
                throw new IndexOutOfBoundsException();
            }
            previous.tail = previous.tail.tail;
        }
    }

    @Override
    public int indexOf(T obj) {
        int index = 0;
        Node current = first;

        while (current != null && !current.head.equals(obj)){
            current = current.tail;
            index++;
        }
        return current == null? -1 : index;
    }

    @Override
    public int size() {
        int size=0;
        Node current = first;
        while(current != null){
            size++;
            current = current.tail;
        }
        return size;
    }

    private Node findNode(int i){
        Node current = first;
        int index = 0;
        if(i<0){
            throw new IndexOutOfBoundsException();
        }
        while(current != null && index < i){
            index++;
            current = current.tail;
        }
        if(current == null){
            throw new IndexOutOfBoundsException();
        }
        return current;
    }

    private class Node{
        private T head;
        private Node tail;

        Node(T head){
            this.head = head;
            this.tail = first;
            first = this;
        }
    }
}
