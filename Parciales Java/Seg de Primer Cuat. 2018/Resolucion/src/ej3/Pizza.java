package ej3;

import java.util.List;

public class Pizza {

    private PizzaType pizzaType;
    private List<Topping>toppings;

    public Pizza(PizzaType pizzaType, List<Topping> toppings) {
        this.pizzaType = pizzaType;
        this.toppings = toppings;
    }

    private int total(){
        int total = pizzaType.getPrice();
        for(Topping topping : toppings){
            total += topping.getPrice();
        }
        return total;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(pizzaType.getDescription());
        for(Topping topping : toppings){
            stringBuilder.append(String.format(" con %s", topping.getDescription()));
        }
        stringBuilder.append(String.format(": %d", total()));
        return stringBuilder.toString();
    }
}
