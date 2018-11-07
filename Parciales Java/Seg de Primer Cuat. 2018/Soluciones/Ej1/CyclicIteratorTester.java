package ej1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CyclicIteratorTester {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hola", "que", "tal", "todo", "bien");
        CyclicIterator<String> listIterator = new CyclicIterator<>(3, list);
        for(int i = 0; listIterator.hasNext() && i < 4; i++) {
            for(String element : listIterator.next()) {
                System.out.print(" :" + element);
            }
            System.out.println();
        }
        System.out.println("----------");
        Set<Integer> set = new HashSet<>();
        CyclicIterator<Integer> setIterator = new CyclicIterator<>(3, set);
        System.out.println(setIterator.hasNext());
        setIterator.next();
    }

}
