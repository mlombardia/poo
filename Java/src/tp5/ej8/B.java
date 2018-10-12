package tp5.ej8;

public class B extends A{
    public void print(Number num){
        System.out.println(String.format(MESSAGE,"B", "Number", num, num.getClass()));
    }
}
