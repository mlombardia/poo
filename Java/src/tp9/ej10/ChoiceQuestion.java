package tp9.ej10;

import java.util.HashSet;
import java.util.Set;

public abstract class ChoiceQuestion extends Question{

    private Set<String> choices;

    public ChoiceQuestion(String caption, Set<String> choices) {
        super(caption);
        this.choices = choices;
    }

    public Set<String> getChoices(){
        return choices;
    }
}
