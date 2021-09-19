class MobileShop{

    private Phone iphone;
    private Phone samsung;
    private Phone realme;

    public MobileShop(){
        iphone = new Iphone();
        samsung = new Samsung();
        realme = new Realme();
    }

    public void showIphone(){
        iphone.price();
        iphone.model();
    }

    public void showSamsung(){
        samsung.price();
        samsung.model();
    }

    public void showRealme(){
        realme.price();
        realme.model();
    }
}