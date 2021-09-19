public class CounterTerrorist implements Player{

    //every CounterTerrorist has same task i.e attack so, it is Intrinsic state
    private final String task;
    //all CounterTerrorists need not have same weapon so it is extrinsic state
    private String weapon;

    public CounterTerrorist(){
        task = "Defend";
    }

    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void mission() {
        System.out.println("CounterTerrorist having "+weapon+" weapon and on a mission "+task);
    }
}