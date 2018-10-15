package tp5.ej10;

public class FriendNotFoundException extends Exception {
    private static final String MESSAGE = "Friend not found";

    public FriendNotFoundException(){
        super(MESSAGE);
    }
}
