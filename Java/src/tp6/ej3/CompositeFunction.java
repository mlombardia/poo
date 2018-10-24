package tp6.ej3;

public class CompositeFunction implements Function {
    Function left, right;

    public CompositeFunction(Function left, Function right){
        this.left = left;
        this.right = right;
    }

    @Override
    public double evaluate(double x) {
        return right.evaluate(left.evaluate(x));
    }
}
