package tp6.ej9;

public class LinearListImpl implements LinearList{

    private Node first;

    @Override
    public void add(Object obj) {
        Node current = first;
        if(first == null){
            first = new Node(obj, null);
        }else{
            while (current.tail != null){
                current = current.tail;
            }
            current.tail = new Node(obj,null);
        }
    }

    @Override
    public Object get(int i) {
        Node current = findNode(i);
        return current.head;
    }

    @Override
    public void set(int i, Object obj) {
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
    public int indexOf(Object obj) {
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

    private static class Node{
        private Object head;
        private Node tail;

        Node(Object head, Node tail){
            this.head = head;
            this.tail = tail;
        }
    }
}
