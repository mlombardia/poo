package tp6.ej1.ej13;

public class GreetingTester {
    public static void main(String[] args){
        Greeting greeting = new GreetingImpl();
        if(greeting instanceof Greeting){
            Greeting var = (Greeting) greeting;
            System.out.println(var.initialGreeting());
        }
        if (greeting instanceof GreetingImpl){
            GreetingImpl var = (GreetingImpl) greeting;
            System.out.println(var.initialGreeting());
        }
    }
}
