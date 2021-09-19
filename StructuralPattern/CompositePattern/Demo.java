import java.util.*;
class Demo{

    public static void main(String args[]){
        Composite computer = new Composite("computer");
        Component peripheral = new Leaf("peripheral",100);
        Composite cabinet = new Composite("cabinet");
        Component hd = new Leaf("hd",500);
        Component motherboard = new Leaf("motherboard",1000);
        cabinet.addComponent(hd);
        cabinet.addComponent(motherboard);
        computer.addComponent(peripheral);
        computer.addComponent(cabinet);
        System.out.println("Computer cost is"+computer.showPrice());
    }
}