package tp8.ej5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Ej5<T extends Comparable<? super T>>{
    public static <T extends Comparable<? super T>>T mayor(Collection<? extends T> valores){
        if (valores.isEmpty()){
            return null;
        }
        T mayor = null;
        for(T elem : valores){
            if (mayor == null || mayor.compareTo(elem) < 0){
                mayor = elem;
            }
        }
        return mayor;
    }

    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(10);
        list.add(15);
        list.add(12);
        System.out.println(Ej5.mayor(list));
    }

}
