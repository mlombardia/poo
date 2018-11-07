package tp9.ej10;

public class TextQuestion extends Question {

    private String answer;

    public TextQuestion(String caption, String answer) {
        super(caption);
        this.answer = answer;
    }

    public boolean isCorrect(String answer){
        return this.answer.equalsIgnoreCase(answer);
    }
}
