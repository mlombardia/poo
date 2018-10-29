package tp8.ej2;

public class Ej2 {
    public static void main(String args[]){
        LinearList<String> list = new LinearListImpl<>();
        list.add("hola");
        list.add("mundo");
        for(String str : list){
            System.out.println(str);
        }
    }
}
