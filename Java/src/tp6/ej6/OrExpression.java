package tp6.ej6;

public class OrExpression extends BinaryExpression {

    public OrExpression(Expression left, Expression right){
        super(left, right);
    }

    @Override
    public boolean evaluate() {
        return left.evaluate() || right.evaluate();
    }
}
