import  java.util.*;

class Demo {
    private static PlayerFactory playerFactory = new PlayerFactory();
    private static final String playerType[] ={"Terrorist","Counter Terrorist"};
    private static final String weaponType[] ={"Grenade","Bomb","AK47"};

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Player p = playerFactory.getPlayer(getRandPlayer());
            p.assignWeapon(getRandWeapon());
            p.mission();
            System.out.println("Player obj"+p);
        }
    }

    public static String getRandPlayer() {
        Random r = new Random();
        int randInt = r.nextInt(playerType.length);
        return playerType[randInt];
    }

    public static String getRandWeapon() {
        Random r = new Random();
        int randInt = r.nextInt(weaponType.length);
        return weaponType[randInt];
    }

}