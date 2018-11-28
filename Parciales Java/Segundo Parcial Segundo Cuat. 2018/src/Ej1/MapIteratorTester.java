package Ej1;
import java.util.HashMap;
import java.util.Map;

public class MapIteratorTester {
    public static void main(String args[]){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        MapIterator<Integer, String> mapIterator = new MapIterator<>(map);
        while (mapIterator.hasNext()){
            System.out.println("Key: " + mapIterator.next());
            System.out.println("Value: " + mapIterator.getValue());
        }
        mapIterator = new MapIterator<>(map);
        try{
            mapIterator.getValue();
        }catch (Exception ex){
            System.out.println(ex.getClass());
        }
        System.out.println(mapIterator.next());
        System.out.println(mapIterator.getValue());
        System.out.println(mapIterator.getValue());
        while(mapIterator.hasNext()){
            mapIterator.next();
        }
        mapIterator.next();
    }
}

/*
Key: 1
Value: One
Key: 2
Value: Two
Key: 3
Value: Three
class java.util.NoSuchElementException
1
One
One
Exception in thread "main" java.util.NoSuchElementException
...
 */
