import java.util.*;
class Channel{

    private String title;
    private List<Subscriber> subscriberList ;

    public String getTitle() {
        return this.title;
    }

    public Channel(String title){
        this.title = title;
        subscriberList = new ArrayList<>();
    }

    public void subscribe(Subscriber s){
        subscriberList.add(s);
    }

    public void unSubscribe(Subscriber s){
        subscriberList.remove(s);
    }

    private void notifyAllSubscribers(){
        for(Subscriber s: subscriberList)
            s.update();
    }

    public void uploadVideo(){
        System.out.println("New video is uploaded");
        notifyAllSubscribers();
    }
}