package tp5.ej1;

public class Ej1 {
    public static void main(String args[]){
        String s1, s2;
        s1 = new String("hola");
        s2 = new String("hola");
        if(s1.equals(s2)){
            System.out.println("Son iguales");
        } else{
            System.out.println("Son distintos");
        }
    }
}

/*
s1 = "hola"; | s1 = new String("hola");
s2 = "hola"; | s2 = s2;
 */

/*
if(s1.compareTo(s2) == 0){ | if(s1.equals(s2)){
 */