package tp5.ej8;

public class A {
    static final String MESSAGE = "Clase %s: Imprime %s %s que es de tipo %s";

    public void print(Object obj){
        System.out.println(String.format(MESSAGE, "A", "Object", obj, obj.getClass()));
    }

    public void print(Number num){
        System.out.println(String.format(MESSAGE, "A", "Number", num, num.getClass()));
    }

    public void print(Integer num){
        System.out.println(String.format(MESSAGE,"A","Integer",num, num.getClass()));
    }
}
