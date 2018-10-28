package tp7.ej9;

import java.util.Arrays;
import java.util.Comparator;

public class Ej9 {
    public static void main(String args[]){
        Integer intArray[] = new Integer[]{7,3,5,1,9};
        Arrays.sort(intArray, Comparator.reverseOrder());
        System.out.println(Arrays.toString(intArray));
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
