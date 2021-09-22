abstract class Game{
    abstract void init();
    abstract void start();
    abstract void end();
    void play(){
        init();
        start();
        end();
    }
}