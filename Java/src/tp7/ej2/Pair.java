package tp7.ej2;

public class Pair<A,B> {
    private A left;
    private B right;

    public Pair(A left, B right){
        this.left = left;
        this.right = right;
    }

    public String toString(){
        return "[" + left.toString() + ", " + right.toString() + "]";
    }

    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(!(o instanceof Pair))
            return false;
        Pair<?, ?> pair = (Pair<?, ?>)o;
        if(!left.equals(pair.left))
            return false;
        return right.equals(pair.right);
    }

    @Override
    public int hashCode(){
        int result = left.hashCode();
        result = 31 * result + right.hashCode();
        return result;
    }

    public void setLeft(A left){
        this.left = left;
    }

    public void setRight(B right){
        this.right = right;
    }
}
