package tp4.ej3;

public class Deletrear {
    public static void main(String args[]){
        for(String word: args) {
            char[] chars = word.toCharArray();
            for(int i = 0; i < chars.length - 1; i++){
                System.out.print(chars[i]);
                System.out.print("-");
            }
            System.out.println(word.charAt(word.length() - 1));
        }
    }
}
