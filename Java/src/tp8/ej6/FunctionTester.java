package tp8.ej6;

public class FunctionTester {
    public static void main(String args[]){
        //se arma (2x)^2 como composicion de 2x y x^2
        CompositeFunction f1 = new CompositeFunction();
        f1.addFunction(new LinearFunction(2,0)); //y=2x
        f1.addFunction(new QuadraticFunction(1,0,0)); //y=x^2
        System.out.println(f1.evaluate(1));//4
        System.out.println(f1.evaluate(2));//16
        //se arma 3sin(2x) como composicion de 2x,sin(x) y 3x
        CompositeFunction f2 = new CompositeFunction();
        f2.addFunction(new LinearFunction(2,0)); //y=2x
        f2.addFunction(new SineFunction()); //y=sin(x)
        f2.addFunction(new LinearFunction(3,0)); //y=3x
        System.out.println(f2.evaluate(0));//0
        System.out.println(f2.evaluate(Math.PI/4)); //3
        CompositeFunction f3 = new CompositeFunction();
        System.out.println(f3.evaluate(1));
    }
}
