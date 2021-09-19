import java.util.*;

class ItemRegistry{

    private Map<String, Item> ht = new HashMap<>();
    public ItemRegistry(){
        loadItems();
    }
    public Item createItem(String type){
        return ht.get(type).clone();
    }
    public void loadItems(){
        Book  b =new Book();
        b.setName("Passion");
        b.setPrice(120);
        Bottle bt = new Bottle();
        bt.setName("Tupperware");
        bt.setPrice(50);
        ht.put("Book",b);
        ht.put("Bottle",bt);
    }
}