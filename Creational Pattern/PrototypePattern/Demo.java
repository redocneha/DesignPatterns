class Demo{
    public static void main(String[] args) {
        ItemRegistry registry = new ItemRegistry();
        Book defaultBook = (Book)registry.createItem("Book");
        Bottle defaultBottle = (Bottle)registry.createItem("Bottle");
        Book b1 = (Book)registry.createItem("Book");
        b1.setPrice(40);
        Bottle bt1 = (Bottle) registry.createItem("Bottle");
        bt1.setName("Milton");
        System.out.println("Default Book ");
        defaultBook.show();
        System.out.println("New Book");
        b1.show();
        System.out.println("Default Bottle ");
        defaultBottle.show();
        System.out.println("New Bottle");
        bt1.show();

    }
}