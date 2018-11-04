package tp9.ej4;

public class RankedBook implements Comparable<RankedBook>{
    private Book book;
    private Genre genre;
    private int ranking;

    RankedBook(Book book, Genre genre){
        this.book = book;
        this.genre = genre;
    }

    RankedBook(Book book){
        this.book = book;
        this.ranking = 1;
    }

    RankedBook(RankedBook rankedBook){
        this.book = rankedBook.book;
        this.ranking = rankedBook.ranking + 1;
        this.genre = rankedBook.genre;
    }

    @Override
    public boolean equals(Object o){
        if (this == o)
            return true;
        if (!(o instanceof RankedBook))
            return false;
        RankedBook aux = (RankedBook) o;
        if (!book.equals(aux.book))
            return false;
        return genre != null ? genre.equals(aux.genre) : aux.genre == null;
    }

    @Override
    public int hashCode(){
        int result = book.hashCode();
        result = 31 * result + (genre != null? genre.hashCode() : 0);
        return result;
    }

    @Override
    public String toString(){
        return String.format("%s : %d", book, ranking);
    }

    @Override
    public int compareTo(RankedBook o) {
        int rankingCmp = o.ranking - ranking;
        if (rankingCmp == 0)
            return book.compareTo(o.book);
        return rankingCmp;
    }

    public Genre getGenre() {
        return genre;
    }

    public Book getBook() {
        return book;
    }
}
