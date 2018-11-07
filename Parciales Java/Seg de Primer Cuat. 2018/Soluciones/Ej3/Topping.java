package ej3;

public enum Topping {

    EXTRA_CHEESE("Extra queso", 20),
    ONION("Cebolla", 10),
    TOMATO("Tomate", 30);

    private String description;
    private double price;

    Topping(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

}
