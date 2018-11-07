package tp9.ej8;

public class CheckingAccount extends BankAccount {
    private double draft;
    public CheckingAccount(Integer id, double draft){
        super(id);
        this.draft = draft;
    }

    public boolean canExtract(double amount){
        return money + draft - amount >= 0;
    }
}
