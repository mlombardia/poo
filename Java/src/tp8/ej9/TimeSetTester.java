package tp8.ej9;

public class TimeSetTester {
    public static void main(String args[]){
        TimeSet<String> timeSet = new TimeSetImpl<>();
        timeSet.add("Taller POO",16,0);
        timeSet.add("Taller PI",13,0);
        timeSet.add("Clase POD",18,0);
        System.out.println(timeSet.size());
        System.out.println(timeSet.contains("Taller POO"));
        System.out.println(timeSet.retrieve(12,0,16,0));
        timeSet.remove("Clase POD");
        System.out.println(timeSet.size());
        System.out.println(timeSet.retrieve(17,30,18,30));
    }
}
