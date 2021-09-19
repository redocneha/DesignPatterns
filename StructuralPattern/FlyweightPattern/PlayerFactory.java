import java.util.*;

class PlayerFactory{
    private HashMap<String,Player> hm = new HashMap<>();
    public Player getPlayer(String playerType){
        if(hm.containsKey(playerType))
            return hm.get(playerType);

        if(playerType.equals("Terrorist")) {
            Terrorist t = new Terrorist();
            hm.put(playerType, t);
            return t;
        }
        CounterTerrorist t = new CounterTerrorist();
        hm.put(playerType, t);
        return t;
    }
}