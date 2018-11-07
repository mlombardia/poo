package tp9.ej8;

import java.util.HashSet;
import java.util.Set;

public class Bank {

    private Set<BankAccount> accounts = new HashSet<>();

    public void addAccount(BankAccount bankAccount) {
        accounts.add(bankAccount);
    }

    public int accountSize() {
        return accounts.size();
    }

    public double totalAmount() {
        double result = 0.0;
        for(BankAccount acc : accounts){
            result += acc.money;
        }
        return result;
    }

    public void removeAccount(BankAccount bankAccount) {
        accounts.remove(bankAccount);
    }
}
