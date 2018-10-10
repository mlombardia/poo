package tp5.ej5;

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
