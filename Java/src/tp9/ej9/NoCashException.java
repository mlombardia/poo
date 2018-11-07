package tp9.ej9;

public class NoCashException extends RuntimeException {
    private static final String MESSAGE = "No hay dinero disponible";

    public NoCashException(){
        super(MESSAGE);
    }
}
