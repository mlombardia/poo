package tp9.ej10;

import java.util.Arrays;
import java.util.HashSet;

public class BooleanQuestion extends SingleChoiceQuestion {

    public BooleanQuestion(String caption, boolean answer){
        super(caption, new HashSet<>(Arrays.asList(String.valueOf(true),String.valueOf(false))),String.valueOf(answer));
    }

    public boolean isCorrect(boolean answer){
        return super.isCorrect(String.valueOf(answer));
    }
}
