package tp6.ej3;

public class QuadraticFunction implements Function {

    private int a, b, c;

    public QuadraticFunction(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double evaluate(double x) {
        double result = 0;
        result = (a*Math.pow(x,2)) + (b * x) + c;
        return result;
    }
}
