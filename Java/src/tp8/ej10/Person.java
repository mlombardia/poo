package tp8.ej10;


public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return String.format("%s # %d", name, age);
    }

    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(!(o instanceof Person))
            return false;
        Person aux = (Person) o;
        if(getName().compareTo(aux.getName()) != 0)
            return false;
        return getAge() == aux.getAge();
    }

    @Override
    public int hashCode(){
        int result = getName().hashCode();
        result = 31*result + getAge();
        return result;
    }
}
