import java.io.*;
abstract class Plan{
    protected double rate;
    abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units*rate);
    }
}

class CommercialPlan extends Plan{
    public void getRate(){
        rate=5.50;
    }

}

class  DomesticPlan extends Plan{
    public void getRate(){
        rate=10;
    }
}
