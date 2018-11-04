package tp9.ej4;

public class RankerTester {
    public static void main(String args[]){
        Ranker ranker = new Ranker();

        Genre fantasy = new Genre("Fantasy");
        Genre crimeFiction = new Genre("Crime Fiction");
        Genre drama = new Genre("Drama");

        Book hp7 = new Book("Harry Potter and the Deadly Hallows", "JK Rowling");
        Book t2t = new Book("The Two Towers", "JRR Tolkien");
        Book theHobbit = new Book("The Hobbit", "JRR Tolkien");
        Book studyInScarlet = new Book("A Study In Scarlet", "Arthur Conan Doyle");
        Book hamlet = new Book("Hamlet", "William Shakespeare");
        Book prejudice = new Book("Pride and Prejudice", "Jane Austen");
        Book eragon = new Book("Eragon", "Christopher Paolini");

        ranker.add(fantasy, hp7);
        ranker.add(fantasy, theHobbit);
        ranker.add(fantasy, t2t);
        ranker.add(crimeFiction, studyInScarlet);
        ranker.add(drama, hamlet);
        ranker.add(drama, prejudice);

        ranker.rateUp(hp7);
        ranker.rateUp(hp7);
        ranker.rateUp(hp7);
        ranker.rateUp(theHobbit);
        ranker.rateUp(theHobbit);
        ranker.rateUp(hamlet);
        ranker.rateUp(new Book("Eragon", "Christopher Paolini"));
        ranker.rateUp(eragon);

        ranker.printRanking(fantasy);
        System.out.println("-----------------------------");
        ranker.printRanking(drama);
        System.out.println("-----------------------------");
        ranker.printRanking(new Genre("Non-Fiction"));
        System.out.println("-----------------------------");
        ranker.printRanking();
    }
}
