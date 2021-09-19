public interface Phone {
    void price();
    void model();
}

class Iphone implements  Phone{
    @java.lang.Override
    public void price() {
        System.out.println("Price of iphone is 65000");
    }

    @java.lang.Override
    public void model() {
        System.out.println("Model of iphone is 13 pro");
    }
}

class Samsung implements  Phone{
    @java.lang.Override
    public void price() {
        System.out.println("Price of Samsung is 25000");
    }

    @java.lang.Override
    public void model() {
        System.out.println("Model of Samsung is J7 pro");
    }
}

class Realme implements  Phone{
    @java.lang.Override
    public void price() {
        System.out.println("Price of Realme is 15000");
    }

    @java.lang.Override
    public void model() {
        System.out.println("Model of Realme is X pro");
    }
}