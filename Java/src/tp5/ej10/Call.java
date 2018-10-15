package tp5.ej10;

public class Call {
    private String from;
    private String to;
    private int duration;

    private static final double COST_PER_SECOND = 0.01;

    Call(String from, String to, int duration){
        this.from = from;
        this.to = to;
        this.duration = duration;
    }

    public double getCost(){
        return duration * COST_PER_SECOND;
    }

    public String getTo(){
        return to;
    }
}
