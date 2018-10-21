package tp5.ej10;

public class BillTester {
    public static void main(String args[]){
        FriendCellPhoneBill myBill = new FriendCellPhoneBill("4444-4444", 3);
        myBill.setCost(98);
        try{
            myBill.addFriend("5555-5555");
            myBill.addFriend("6666-6666");
        }catch (TooManyFriendsException | AlreadyExistsFriendException e){
            // No ocurre
        }
        myBill.registerCall("5555-5555",10);
        myBill.registerCall("6666-6666", 10);
        System.out.println(myBill.proccessBill());
        try{
            myBill.addFriend("6666-6666");
        }catch (AlreadyExistsFriendException e){
            System.out.println(e.getMessage());
        } catch (TooManyFriendsException e){
            //No ocurre
        }
        try{
            myBill.addFriend("4444-4444");
            myBill.addFriend("7777-7777");
        }catch(TooManyFriendsException e){
            System.out.println(e.getMessage());
        }catch (AlreadyExistsFriendException e){
            //No ocurre
        }
        try{
            myBill.removeFriend("5555-5555");
            myBill.removeFriend("5555-5555");
        }catch (FriendNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
