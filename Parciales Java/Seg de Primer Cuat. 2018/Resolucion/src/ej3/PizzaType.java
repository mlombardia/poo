package ej3;

public enum PizzaType {
    PARRILLA("Pizza a la Parrilla", 150),
    HORNO("Pizza al Horno", 100);

    private String description;
    private int price;

    PizzaType(String description, int price){
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
