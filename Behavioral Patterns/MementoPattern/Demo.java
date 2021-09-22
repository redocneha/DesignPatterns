class Demo{
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        originator.setState("State1");
        originator.setState("State2");
        caretaker.addMemento(originator.saveStateToMemento());
        originator.setState("State3");
        caretaker.addMemento(originator.saveStateToMemento());
        originator.getStateFromMemento(caretaker.getMemento(0));
        System.out.println("First saved state"+originator.getState());
        originator.getStateFromMemento(caretaker.getMemento(1));
        System.out.println("Second saved state"+originator.getState());

    }
}