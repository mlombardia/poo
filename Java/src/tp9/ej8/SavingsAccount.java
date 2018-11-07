package tp9.ej8;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(Integer id){
        super(id);
    }

    @Override
    protected boolean canExtract(double amount) {
        return money - amount >= 0;
    }
}
