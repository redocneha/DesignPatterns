import java.util.*;
public class Composite implements Component{
     String name;
     List<Component> compList ;
     public Composite(String name){
        super();
        this.name = name;
        compList = new ArrayList<>();
    }

 public void addComponent(Component newComp){
    compList.add(newComp);
 }
 @Override
 public  int showPrice(){
    int s=0;
    for(Component c : compList)
        s+=c.showPrice();
   return s;
  }
}