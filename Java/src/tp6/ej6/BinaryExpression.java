package tp6.ej6;

public abstract class BinaryExpression extends Expression {

    protected Expression left, right;

    public BinaryExpression(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    public abstract boolean evaluate();
}
