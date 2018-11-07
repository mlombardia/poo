package tp9.ej9;

import java.util.Arrays;

public class CashierTester {
    public static void main(String args[]){
        ChangeCashier cashier = new ChangeCashier(new NoteDispenser());
        cashier.loadMoney(Arrays.asList(2,5,2,100,100,50,2,10,5,10,20,1,1,2,5,10,10));
        cashier.getMoney(11);
    }
}
