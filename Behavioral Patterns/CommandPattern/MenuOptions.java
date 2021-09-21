class MenuOptions{
    private Command actionSaveCommand;
    private Command actionOpenCommand;

    public MenuOptions(Command actionSaveCommand,Command actionOpenCommand){
        this.actionOpenCommand = actionOpenCommand;
        this.actionSaveCommand = actionSaveCommand;
    }
    public void saveDocument(){
        actionSaveCommand.execute();
    }
    public void openDocument(){
        actionOpenCommand.execute();
    }
}