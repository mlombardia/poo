package tp5.ej9;

public class PolynomialTester {
    public static void main(String args[]) throws InvalidGradeException, InvalidIndexException{
        Polynomial fourthGradePol = new Polynomial(4);
        fourthGradePol.set(2, 3.1);
        fourthGradePol.set(3, 2);
        System.out.println(fourthGradePol.eval(2)); //28.4
        System.out.println(new Polynomial(3).eval(5)); //0
        try{
            new Polynomial(-4);
        } catch (InvalidGradeException e){
            System.out.println(e.getMessage()); //Grado Invalido
        }
        try{
            fourthGradePol.set(7,1.5);
        }catch (InvalidIndexException e){
            System.out.println(e.getMessage());
        }

    }
}
