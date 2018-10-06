package tp5.ej5;

public class BankAccountTester {
    public static void main(String args[]){
        CheckingAccount myCheckingAccount = new CheckingAccount(1001, 50);
        myCheckingAccount.deposit(100.0);
        System.out.println(myCheckingAccount);
        myCheckingAccount.extract(150.0);
        System.out.println(myCheckingAccount);
        SavingsAccount mySavingsAccount = new SavingsAccount(1002);
        mySavingsAccount.deposit(100.0);
        System.out.println(mySavingsAccount);
        mySavingsAccount.extract(150.0);
    }
}
/*
Cuenta 1001 con saldo 100.0
Cuenta 1001 con saldo -50.0
Cuenta 1002 con saldo 100.0
No cuenta con los fondos necesarios
 */