package ej3;

public enum PizzaType {

    BARBACUE("Pizza a la parrilla", 150),
    OVEN("Pizza al horno", 100);

    private String description;
    private double price;

    PizzaType(String description, double price) {
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
