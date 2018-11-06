package tp9.ej8.bank;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(Integer id){
        this.id = id;
    }

    public void extract(double amount){
        money -= amount;
    }
}
