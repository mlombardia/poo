package tp5.ej10;

public class BillTester {
    public static void main(String args[]) throws AlreadyExistsFriendException{
        FriendCellPhoneBill myBill = new FriendCellPhoneBill("4444-4444", 3);
        myBill.addFriend("5555-5555");
        myBill.addFriend("6666-6666");
        myBill.registerCall("5555-5555",10);
        myBill.registerCall("6666-6666", 10);
        System.out.println(myBill.proccessBill());
        try{
            myBill.addFriend("6666-6666");
        }catch (AlreadyExistsFriendException e){
            System.out.println(e.getMessage());
        }
        myBill.addFriend("4444-4444");
        try{
            myBill.addFriend("7777-7777");
        }catch(TooManyFriendsException e){
            System.out.println(e.getMessage());
        }
    }
}
