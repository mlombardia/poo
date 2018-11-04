package tp9.ej3;

public class PersonCollectionTester {
    public static void main(String args[]){
        PersonCollection personCollection = new PersonCollectionImpl();
        personCollection.addPerson(new Person("Juan", "Perez", null));
        personCollection.addPerson(new Person("Jose", "Perez", null));
        personCollection.addPerson(new Person("Pedro", "Gomez", null));
        System.out.println(personCollection.findByLastName("Perez"));
        System.out.println(personCollection.findByName("Pedro", "Gomez"));
    }
}
