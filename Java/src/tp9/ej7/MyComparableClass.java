package tp9.ej7;

public class MyComparableClass implements Comparable<MyComparableClass>{

    public String sortableIdentifier;
    private final String identifier;

    public MyComparableClass(String identifier) {
        if (identifier == null){
            throw new IllegalArgumentException();
        }
        this.identifier = identifier;
    }

    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(!(o instanceof MyComparableClass))
            return false;
        MyComparableClass that = (MyComparableClass) o;
        return identifier.equals(that.identifier);
    }

    @Override
    public int hashCode(){
        return identifier.hashCode();
    }

    @Override
    public String toString(){
        return identifier + "-" + "(" + sortableIdentifier + ")";
    }

    @Override
    public int compareTo(MyComparableClass o) {
        return sortableIdentifier.compareTo(o.sortableIdentifier);
    }
}
