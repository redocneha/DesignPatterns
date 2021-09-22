class Subscriber{
    private String name;
    private Channel channel;

    public Subscriber(String name){
        this.name = name;
    }

    public void subscribeTo(Channel ch){
        this.channel = ch;
    }

    public void update(){
        System.out.println(name+" got notified for "+channel.getTitle());
    }

}