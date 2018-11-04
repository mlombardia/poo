package tp9.ej4;

public class Genre {
    private String name;

    public Genre(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(!(o instanceof Genre))
            return false;
        Genre aux = (Genre) o;
        return name.equals(aux.name);
    }

    @Override
    public int hashCode(){
        return name.hashCode();
    }
}
