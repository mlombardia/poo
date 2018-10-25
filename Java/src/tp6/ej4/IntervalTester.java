package tp6.ej4;

public class IntervalTester {
    public static void main(String args[]){
        Interval interval = new Interval(1,10,0.3f);
        System.out.println(interval);
        System.out.println(interval.size());
        System.out.println(interval.at(3));
        System.out.println(interval.indexOf(2.2f));
        System.out.println(interval.includes(0.5f));
        System.out.println(interval.equals(new Interval(1,10,0.3f)));
        System.out.println(interval.hashCode() == new Interval(1,10,0.3f).hashCode());
    }
}
