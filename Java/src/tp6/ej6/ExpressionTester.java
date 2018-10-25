package tp6.ej6;

public class ExpressionTester {
    public static void main(String args[]){
        Expression exp1 = new SimpleExpression(true); //true
        Expression exp2 = new SimpleExpression(false); //false
        Expression exp3 = exp1.not(); // false
        Expression exp4 = exp1.or(exp2); //true
        Expression exp5 = exp3.and(exp4); //false
        System.out.println(exp1.evaluate()); //true
        System.out.println(exp3.evaluate()); // false
        System.out.println(exp4.evaluate()); //true
        System.out.println(exp5.evaluate()); //false
        ((SimpleExpression) exp1).setValue(false);
        System.out.println(exp3.evaluate()); //true
        System.out.println(exp4.evaluate()); //false
        System.out.println(exp5.evaluate()); //false
        ((SimpleExpression) exp2).setValue(true);
        System.out.println(exp5.evaluate()); //true
    }
}
