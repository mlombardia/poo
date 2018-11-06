package tp9.ej8.bank;

abstract class BankAccount {
    protected Integer id;
    protected double money;

    protected void deposit(double amount){
        money += amount;
    }

    @Override
    public String toString(){
        return String.format("Cuenta %d con saldo: %g", id, money);
    }
}
