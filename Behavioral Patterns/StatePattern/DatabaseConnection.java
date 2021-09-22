class DatabaseConnection implements Connection{
    @java.lang.Override
    public void close() {
        System.out.println("Connection closed for db");
    }

    @java.lang.Override
    public void open() {
        System.out.println("Connection opened for db");
    }
}
