package tp5.ej10;

public class TooManyFriendsException extends Exception {
    private static final String MESSAGE = "Too many friends on list";

    public TooManyFriendsException(){
        super(MESSAGE);
    }
}
