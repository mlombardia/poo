package tp9.ej3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonCollectionImpl implements PersonCollection{

    private Map<String, Map<String, Person>> collection = new HashMap<>();

    @Override
    public void addPerson(Person aPerson) {

    }

    @Override
    public List<Person> findByLastName(String lastName) {
        return null;
    }

    @Override
    public Person findByName(String firstName, String lastName) {
        return null;
    }
}
