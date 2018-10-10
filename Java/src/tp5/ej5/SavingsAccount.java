package tp5.ej5;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(Integer id){
        this.id = id;
    }

    public void extract(double amount){
        money -= amount;
    }
}
