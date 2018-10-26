package tp7.ej7;

import java.util.Arrays;

public class PairTester {
    public static void main(String args[]){
        Integer intArray[] = new Integer[]{7,3,1,5,9};
        Arrays.sort(intArray);
        arrayPrinter(intArray);
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
