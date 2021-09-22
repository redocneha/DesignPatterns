class User{
    String name;

    public String getName() {
        return this.name;
    }
    public User(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}