package tp9.ej8;

public enum BankAccountMovementType {

    EXTRACTION("Extraction"),
    DEPOSIT("Deposit");

    private String description;

    BankAccountMovementType(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
