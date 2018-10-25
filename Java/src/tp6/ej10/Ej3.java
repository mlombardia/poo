package tp6.ej10;

import tp6.ej10.exceptions.*;

public class Ej3 {
    public static void main(String args[]){
        Ej3 ej3 = new Ej3();
        try{
            ej3.method();
        }catch (Exception3 e){
            System.out.println("Excepcion 3 capturada");
        }catch (Exception2 e){
            System.out.println("Excepcion 2 capturada");
        }
    }

    public void method() throws Exception3{
        throw new Exception3();
    }
}
