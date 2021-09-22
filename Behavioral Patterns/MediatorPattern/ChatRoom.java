import java.util.Date;

class ChatRoom {
    public static void showMessage(User u,String message){
        System.out.println("User "+ u.getName()+" has sent"+message+" at "+new Date().toString());
    }
}