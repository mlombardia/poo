package tp9.ej10;

public class NumericQuestion extends TextQuestion {
    public NumericQuestion(String caption, int answer) {
        super(caption, String.valueOf(answer));
    }

    public boolean isCorrect(int answer){
        return super.isCorrect(String.valueOf(answer));
    }
}
