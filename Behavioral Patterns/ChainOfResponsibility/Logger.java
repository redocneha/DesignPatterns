abstract class Logger{

    public static int OUTPUT_INFO = 1;
    public static int OUTPUT_DEBUG = 2;
    public static int OUTPUT_ERROR = 3;

    protected static int currLevel;

    protected  Logger nextLogger;

    public void setNextLogger(Logger logger){
        this.nextLogger = logger;
    }

    public void logMessage(int level,String message){
        if(this.currLevel == 3 && level > this.currLevel)
            System.out.println("No error with more than 3 logger");
        if(this.currLevel == level)
            displayLog(message);
        else
        nextLogger.displayLog(message);
    }

    abstract public void displayLog(String message);

}

class ConsoleLogger extends  Logger{
    public ConsoleLogger(int level){
        this.currLevel = level;
    }
    @java.lang.Override
    public void displayLog(String message) {
        System.out.println("Info log: "+message);
    }
}


class DebugLogger extends  Logger{
    public DebugLogger(int level){
        this.currLevel = level;
    }
    @java.lang.Override
    public void displayLog(String message) {
        System.out.println("Debug log: "+message);
    }
}

class ErrorLogger extends  Logger{
    public ErrorLogger(int level){
        this.currLevel = level;
    }
    @java.lang.Override
    public void displayLog(String message) {
        System.out.println("Error log: "+message);
    }
}
