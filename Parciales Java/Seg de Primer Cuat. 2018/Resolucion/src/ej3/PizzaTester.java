package ej3;

import java.util.Arrays;

public class PizzaTester {
    public static void main(String args[]){
        // Pizza a la parrilla con Tomate
        Pizza pizza1 = new Pizza(PizzaType.PARRILLA, Arrays.asList(Topping.TOMATE));
        // Pizza a la parrilla con Tomate con Cebolla con Extra queso
        Pizza pizza2 = new Pizza(PizzaType.PARRILLA, Arrays.asList(Topping.TOMATE, Topping.CEBOLLA, Topping.EXTRA_QUESO));
        // Pizza al horno con Cebolla con Extra queso
        Pizza pizza3 = new Pizza(PizzaType.HORNO, Arrays.asList(Topping.CEBOLLA, Topping.EXTRA_QUESO));
        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
    }
}
