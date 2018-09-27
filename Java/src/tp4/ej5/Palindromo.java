package tp4.ej5;

public class Palindromo {
    public static void main(String args[]){
        StringBuilder str = new StringBuilder();
        for (String word:args){
            str.append(word);
        }
        if(str.toString().compareToIgnoreCase(str.reverse().toString()) == 0){
            System.out.println("ES PALINDROMO");
        }else{
            System.out.println("NO ES PALINDROMO");
        }
    }
}
