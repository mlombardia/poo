package tp7.ej8;

import java.util.Arrays;

public class PairTester {
    public static void main(String args[]){
        Integer intArray[] = new Integer[]{7,3,1,5,9};
        Arrays.sort(intArray);
        arrayPrinter(intArray);
        Pair<String, String> stringPair1 = new Pair<>("hola","mundo");
        Pair<String,String> stringPair2 = new Pair<>("hola", "adios");
        Pair<String,String> stringPair3 = new Pair<>("buen", "dia");
        Pair pairArray[] = new Pair[]{stringPair1, stringPair2, stringPair3};
        Arrays.sort(pairArray);
        arrayPrinter(pairArray);
    }

    public static <T> void arrayPrinter(T[] array){
        StringBuilder stringBuilder = new StringBuilder("[");
        for(int i = 0; i<array.length;i++){
            stringBuilder.append(array[i]).append(",");
        }
        stringBuilder.setCharAt(stringBuilder.length() - 1, ']');
        System.out.println(stringBuilder.toString());
    }

}
