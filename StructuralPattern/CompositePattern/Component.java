import java.util.*;

interface Component{
    int showPrice();
}

class Leaf implements Component{
    String name;
    int price;
    public Leaf(String name,int price){
    super();
    this.name=name;
    this.price=price;
    }
    public int showPrice(){
        return price;
    }
}
