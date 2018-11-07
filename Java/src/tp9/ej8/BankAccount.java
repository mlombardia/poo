package tp9.ej8;

import java.util.ArrayList;
import java.util.List;

public abstract class BankAccount {
    protected Integer id;
    private List<BankAccountMovement> movements;
    protected double money;

    protected BankAccount(int id){
        this.id = id;
        this.movements = new ArrayList<>();
    }

    protected void deposit(double amount){
        movements.add(new BankAccountMovement(BankAccountMovementType.DEPOSIT, -amount));
        money += amount;
    }

    public double extract(double amount){
        return extract(new BankAccountMovement(BankAccountMovementType.EXTRACTION, -amount));
    }

    protected double extract(BankAccountMovement movement){
        if(!canExtract(movement.getBalance())){
            throw new IllegalArgumentException("No cuenta con los fondos necesarios");
        }
        movements.add(movement);
        return money -= movement.getBalance();
    }
    @Override
    public String toString(){
        return String.format("Cuenta %d con saldo: %g", id, money);
    }

    public void showMovements(){
        System.out.println("Movements for account " + id);
        for(BankAccountMovement bankAccountMovement : movements){
            System.out.println(bankAccountMovement);
        }
    }

    abstract protected boolean canExtract(double amount);
}
