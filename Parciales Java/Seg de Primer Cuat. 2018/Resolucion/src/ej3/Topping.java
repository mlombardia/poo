package ej3;

public enum Topping {
    EXTRA_QUESO("Extra queso", 20),
    TOMATE("Tomate", 30),
    CEBOLLA("Cebolla", 10);

    private String description;
    private int price;

    Topping(String description, int price){
        this.description = description;
        this.price = price;
    }

    public String getDescription(){
        return description;
    }

    public int getPrice(){
        return price;
    }
}
