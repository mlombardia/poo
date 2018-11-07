package tp9.ej10;

import java.util.Set;

public class MultipleChoiceQuestion extends ChoiceQuestion {

    private Set<String> answer;

    public MultipleChoiceQuestion(String caption, Set<String> choices, Set<String> answer) {
        super(caption, choices);
        this.answer = answer;
        if (!choices.containsAll(answer)){
            throw new IllegalArgumentException("Invalid answer!");
        }
    }

    public boolean isCorrect(Set<String> answer){
        return this.answer.equals(answer);
    }
}
