package tp6.ej10;

import tp6.ej10.exceptions.*;

public class Ej6 {
    public static void main(String args[]){
        try{
            System.out.println("Dentro del bloque try");
        }catch (Exception4 e){
            System.out.println("Dentro del bloque catch");
        }
    }
}
