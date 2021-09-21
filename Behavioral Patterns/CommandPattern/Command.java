interface Command{
    void execute();
}

class ActionSaveCommand implements Command{

    Document doc;
    public ActionSaveCommand(Document doc){
        this.doc = doc;
    }
    @java.lang.Override
    public void execute() {
        doc.save();
    }
}

class ActionOpenCommand implements Command{

    Document doc;
    public ActionOpenCommand(Document doc){
        this.doc = doc;
    }
    @java.lang.Override
    public void execute() {
        doc.open();
    }
}