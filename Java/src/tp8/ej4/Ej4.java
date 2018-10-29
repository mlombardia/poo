package tp8.ej4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ej4 {
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(8);
        list.add(10);
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            if(it.next()%2 == 0)
                it.remove();
        }
        //Otra solucion: list.removeIf(integer -> integer % 2 == 0);
    }
}
