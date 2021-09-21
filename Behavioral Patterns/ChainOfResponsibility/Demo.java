class Demo{
    public static Logger doChaining(){
        Logger consoleLogger = new ConsoleLogger(Logger.OUTPUT_INFO);
        Logger debugLogger = new DebugLogger(Logger.OUTPUT_DEBUG);
        consoleLogger.setNextLogger(debugLogger);
        Logger errorLogger = new ErrorLogger(Logger.OUTPUT_ERROR);
        debugLogger.setNextLogger(errorLogger);
        errorLogger.setNextLogger(consoleLogger);
        return consoleLogger;
    }
    public static void main(String[] args) {
        Logger logger = doChaining();
        logger.logMessage(1,"This is to log info");
        logger.logMessage(2,"This is to log debug info");
        logger.logMessage(3,"This is to log error info");
        logger.logMessage(2,"This is to log debug info");
    }
}