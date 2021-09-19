abstract class Item implements Cloneable {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Item clone(){
        Item clonedItem = null;
        try{
            clonedItem = (Item) super.clone(); // shallow clone
            clonedItem.setName(name);
            clonedItem.setPrice(price); //deep clone
        }
       catch (CloneNotSupportedException e){
            e.printStackTrace();
       }
        return clonedItem;
    }
    public void show(){
        System.out.println(this.name+" "+this.price);
    }
}


class Book extends  Item{
    public Book(){

    }

}
class Bottle extends  Item{
    public Bottle(){

    }

}