
public class Terrorist implements Player{

    //every terrorist has same task i.e attack so, it is Intrinsic state
    private final String TASK;
    //all terrorists need not have same weapon so it is extrinsic state
    private String weapon;

    public Terrorist() {
        TASK = "Attack";
    }

    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }


    public void mission() {
        System.out.println("Terrorist having "+weapon+" weapon and on a mission "+TASK);
    }
}

