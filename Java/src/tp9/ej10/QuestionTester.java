package tp9.ej10;

import java.util.Arrays;
import java.util.HashSet;

public class QuestionTester {
    public static void main(String args[]){
        TextQuestion question1 = new TextQuestion("¿Cual es la capital de La Pampa?", "Santa Rosa");
        System.out.println(question1.isCorrect("La Pampa"));
        System.out.println(question1.isCorrect("Santa Rosa"));
        NumericQuestion question2 = new NumericQuestion("¿En qué año fue la Revolucion" +
                " de Mayo?", 1810);
        System.out.println(question2.isCorrect(1816));
        System.out.println(question2.isCorrect(1810));
        SingleChoiceQuestion question3 = new SingleChoiceQuestion("¿Cual es la capital de Australia?",
                new HashSet<>(Arrays.asList("Sydney", "Canberra", "Melbourne")), "Canberra");
        System.out.println(question3.isCorrect("Sydney"));
        System.out.println(question3.isCorrect("Canberra"));
        MultipleChoiceQuestion question4 = new MultipleChoiceQuestion("Cuales de las siguientes son ciudades" +
                " capitales de paises?", new HashSet<>(Arrays.asList("Buenos Aires", "Punta del Este", "Natal",
                "Montevideo", "Santiago de Chile")),
                new HashSet<>(Arrays.asList("Buenos Aires", "Montevideo", "Santiago de Chile")));
        System.out.println(question4.isCorrect(new HashSet<>(Arrays.asList("Buenos Aires", "Montevideo"))));
        System.out.println(question4.isCorrect(new HashSet<>(Arrays.asList("Buenos Aires", "Montevideo",
                "Santiago de Chile"))));
        BooleanQuestion question5 = new BooleanQuestion("La capital de Argentina es La Plata",
                false);
        System.out.println(question5.isCorrect(true));
        System.out.println(question5.isCorrect(false));
    }
}
