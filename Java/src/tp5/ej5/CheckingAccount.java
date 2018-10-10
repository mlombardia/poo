package tp5.ej5;

public class CheckingAccount extends BankAccount {
    private double draft;
    public CheckingAccount(Integer id, double draft){
        this.id = id;
        this.draft = draft;
    }

    public void extract(double amount){
        if(amount > money + draft){
            throw new IllegalArgumentException("No cuenta con los fondos necesarios");
        }
        money -= amount;
    }
}
