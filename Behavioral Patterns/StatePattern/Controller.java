class Controller{
    private static DatabaseConnection databaseConnection;
    private static SalesConnection  salesConnection;
    private Connection connection;
    public Controller(){
        databaseConnection = new DatabaseConnection();
        salesConnection = new SalesConnection();
    }

    public void setDbConnection() {
        connection = databaseConnection;
    }

    public void setSalesConnection() {
        connection = salesConnection;
    }

    public void open(){
        connection.open();
    }
    public void close(){
        connection.close();
    }

}