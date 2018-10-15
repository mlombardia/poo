package tp5.ej9;

public class InvalidGradeException extends Exception {
    private static final String MESSAGE = "Grado invalido";

    public InvalidGradeException(){
        super(MESSAGE);
    }
}
