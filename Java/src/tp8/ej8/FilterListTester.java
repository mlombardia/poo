package tp8.ej8;

public class FilterListTester {
    public static void main(String args[]){
        FilterList<Integer> list = new ArrayFilterList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.filter(obj -> obj%2 ==0));
    }
}
