package tp6.ej6;

public abstract class Expression {
    public abstract boolean evaluate();

    public Expression not(){
         return new NotExpression(this);
    }

    public Expression or(Expression other){
        return new OrExpression(this, other);
    }

    public Expression and(Expression other){
        return new AndExpression(this, other);
    }
}
