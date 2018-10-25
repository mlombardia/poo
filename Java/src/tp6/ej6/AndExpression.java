package tp6.ej6;

public class AndExpression extends BinaryExpression {

    public AndExpression(Expression left, Expression right){
        super(left, right);
    }

    @Override
    public boolean evaluate() {
        return left.evaluate() && right.evaluate();
    }
}
