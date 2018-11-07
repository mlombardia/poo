package ej3;

import java.util.Arrays;

public class PizzaTester {

	public static void main(String[] args) {
		// Pizza a la parrilla con Tomate
		Pizza pizza1 = new Pizza(PizzaType.BARBACUE, Arrays.asList(Topping.TOMATO));
		// Pizza a la parrilla con Tomate con Cebolla con Extra queso
        Pizza pizza2 = new Pizza(PizzaType.BARBACUE, Arrays.asList(Topping.TOMATO, Topping.ONION, Topping.EXTRA_CHEESE));
		// Pizza al horno con Cebolla con Extra queso
		Pizza pizza3 = new Pizza(PizzaType.OVEN, Arrays.asList(Topping.ONION, Topping.EXTRA_CHEESE));
		System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
	}

}
