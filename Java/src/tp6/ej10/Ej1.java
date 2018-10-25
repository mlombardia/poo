package tp6.ej10;

import tp6.ej10.exceptions.*;

public class Ej1 {
    public static void main(String args[]){
        Ej1 ej1 = new Ej1();
        try{
            ej1.method();
            System.out.println("Metodo ejecutado");
        }catch (Exception2 e){
            System.out.println("Excepcion 2 capturada");
        }finally {
            System.out.println("Finalizando");
        }
    }

    public void method() throws Exception3{
        throw new Exception3();
    }
}
