package tp5.ej9;

public class InvalidIndexException extends Exception {
    private static final String MESSAGE = "Indice invalido";

    public InvalidIndexException(){
        super(MESSAGE);
    }
}
