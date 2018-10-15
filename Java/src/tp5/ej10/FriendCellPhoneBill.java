package tp5.ej10;

public class FriendCellPhoneBill extends CellPhoneBill {
    private String[] friends;
    private int friendsIndex;
    private int friendsLimit;
    private double cost;

    private static final double DEFAULT_FRIEND_COST_PER_SECOND = 0;

    FriendCellPhoneBill(String number, int limit){
        super(number);
        this.friends = new String[limit];
        this.friendsIndex = 0;
        this.friendsLimit = limit;
        this.cost = DEFAULT_FRIEND_COST_PER_SECOND;
    }

    @Override
    public double proccessBill(){

    }

    public void setCost(){
        this.cost = cost;
    }

    public void addFriend(String friend) throws TooManyFriendsException, AlreadyExistsFriendException{

    }

    private boolean containsFriend(String friend){
        for(int i = 0; i < friendsIndex; i++){
            if(friends[i].compareTo(friend) == 0){
                return true;
            }
        }
        return false;
    }

    public void removeFriend(String friend) throws FriendNotFoundException{
        boolean found = false;
        for(int i=0; i < friendsIndex; i++){
            if(friends[i].compareTo(friend) == 0){
                friends[i] = friends[--friendsIndex];
                found = true;
            }
        }
        if(!found){
            throw new FriendNotFoundException();
        }
    }
}
