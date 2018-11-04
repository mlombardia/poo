package tp9.ej4;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ranker {

    private Set<RankedBook> rankedBooks = new TreeSet<>();

    public void add(Genre genre, Book book) {
        rankedBooks.add(new RankedBook(book,genre));
    }

    public void rateUp(Book book) {
        boolean found = false;
        Iterator<RankedBook> iterator = rankedBooks.iterator();
        while(iterator.hasNext() && !found){
            RankedBook rankedBook = iterator.next();
            if(rankedBook.getBook().equals(book)){
                iterator.remove();
                rankedBooks.add(new RankedBook(rankedBook));
                found = true;
            }
        }
        if(!found){
            rankedBooks.add(new RankedBook(book));
        }
    }

    public void printRanking(Genre genre) {
        System.out.println("Ranking of " + genre);
        for (RankedBook rankedBook : rankedBooks){
            if(genre.equals(rankedBook.getGenre())){
                System.out.println(rankedBook);
            }
        }
    }

    public void printRanking() {
        System.out.println("General Ranking");
        for(RankedBook rankedBook : rankedBooks){
            System.out.println(rankedBook);
        }
    }
}
