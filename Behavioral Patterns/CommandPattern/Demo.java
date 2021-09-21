class Demo{
    public static void main(String[] args) {
        Document doc = new Document();
        Command saveCommand = new ActionSaveCommand(doc);
        Command openCommand = new ActionOpenCommand(doc);

        MenuOptions menuOptions = new MenuOptions(saveCommand,openCommand);

        menuOptions.saveDocument();

        menuOptions.openDocument();

    }
}