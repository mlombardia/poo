package ej3;

import java.util.List;

public class Pizza {

    private PizzaType type;
    private List<Topping> toppings;

    public Pizza(PizzaType type, List<Topping> toppings) {
        this.type = type;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(type.getDescription());
        double totalPrice = type.getPrice();
        for(Topping topping : toppings) {
            stringBuilder.append(String.format(" con %s", topping.getDescription()));
            totalPrice += topping.getPrice();
        }
        stringBuilder.append(": ").append("$").append(String.format("%.2f", totalPrice));
        return stringBuilder.toString();
    }

}
