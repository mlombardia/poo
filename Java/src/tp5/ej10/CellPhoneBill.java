package tp5.ej10;

public class CellPhoneBill {
    private String number;
    Call[] calls;
    int callsIndex;

    private static final int DEFAULT_SIZE = 10;

    CellPhoneBill(String number){
        this.number = number;
        this.calls = new Call[DEFAULT_SIZE];
        this.callsIndex = 0;
    }

    public void registerCall(String toNumber, int duration){
        addCall(new Call(number, toNumber, duration));
    }

    public void addCall(Call call){
        if(callsIndex == calls.length){
            resize();
        }
        calls[callsIndex++] = call;
    }

    public double proccessBill(){
        double result = 0;
        for(int i = 0; i < callsIndex; i++){
            result += calls[i].getCost();
        }
        return result;
    }

    private void resize(){
       Call[] aux = new Call[calls.length + DEFAULT_SIZE];
       System.arraycopy(calls,0, aux, 0, calls.length);
       calls = aux;
    }
}
