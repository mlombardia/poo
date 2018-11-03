package tp9.ej1;

public class Pair<T> {
    private T left;
    private T right;

    Pair(T left, T right){
        this.left = left;
        this.right = right;
    }

    public String toString(){
        return String.format("#%s + %s#", left, right);
    }
}
