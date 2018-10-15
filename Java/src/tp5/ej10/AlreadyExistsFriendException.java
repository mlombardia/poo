package tp5.ej10;

public class AlreadyExistsFriendException extends Exception {
    private static final String MESSAGE="Friend already on list";

    public AlreadyExistsFriendException(){
        super(MESSAGE);
    }
}
