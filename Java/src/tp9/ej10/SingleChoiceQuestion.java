package tp9.ej10;

import java.util.Set;

public class SingleChoiceQuestion extends ChoiceQuestion {

    private String answer;

    public SingleChoiceQuestion(String caption, Set<String> choices, String answer) {
        super(caption, choices);
        this.answer = answer;
        if (!choices.contains(answer)){
            throw new IllegalArgumentException("Invalid answer!");
        }
    }

    public boolean isCorrect(String answer){
        return this.answer.equalsIgnoreCase(answer);
    }
}
