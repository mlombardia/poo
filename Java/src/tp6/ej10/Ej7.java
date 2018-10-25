package tp6.ej10;

import tp6.ej10.exceptions.*;

public class Ej7 {
    public static void main(String args[]){
        try{
            System.out.println("Dentro del bloque try");
            throw new Exception2();
        }catch (Exception2 e){
            System.out.println("Dentro del bloque catch");
        }
    }
}
