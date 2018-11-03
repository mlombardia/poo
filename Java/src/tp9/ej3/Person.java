package tp9.ej3;

import java.util.Date;

public class Person {
    private String firstName;
    private String lastName;
    private Date bornDate;

    public Person(String firstName, String lastName, Date bornDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.bornDate = bornDate;
    }

    @Override
    public boolean equals(Object o){
        if (this == o)
            return true;
        if(!(o instanceof Person))
            return false;
        Person person =(Person) o;
        if(!firstName.equals(person.firstName))
            return false;
        return lastName.equals(person.lastName);
    }

    @Override
    public int hashCode(){
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }

    @Override
    public String toString(){
        return "Person{" + "firstName'" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
}
