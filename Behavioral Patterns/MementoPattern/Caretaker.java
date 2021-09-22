import java.util.*;
class Caretaker{
    public List<Memento> mementoList ;
    public Caretaker(){
        mementoList = new ArrayList<>();
    }
    public Memento getMemento(int index) {
        return mementoList.get(index);
    }

    public void addMemento(Memento memento){
        mementoList.add(memento);
    }
}