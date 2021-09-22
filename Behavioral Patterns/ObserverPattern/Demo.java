class Demo{
    public static void main(String[] args) {
        Channel channel = new Channel("Telusko");
        Subscriber neha = new Subscriber("Neha");
        neha.subscribeTo(channel);
        Subscriber irfan = new Subscriber("Irfan");
        irfan.subscribeTo(channel);
        channel.subscribe(neha);
        channel.subscribe(irfan);
        channel.uploadVideo();
    }
}