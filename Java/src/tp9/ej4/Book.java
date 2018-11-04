package tp9.ej4;

public class Book implements Comparable<Book>{

    private String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(!(o instanceof Book))
            return false;
        Book aux = (Book) o;
        if(!name.equals(aux.name))
            return false;
        return author.equals(aux.author);
    }

    @Override
    public int hashCode(){
        int result = name.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }

    @Override
    public int compareTo(Book o) {
        int nameCmp = name.compareTo(o.name);
        if(nameCmp != 0){
            return nameCmp;
        }
        return author.compareTo(o.author);
    }
}
