public class BankFactory  extends AbstractFactory{
    public Loan getLoan(String loan){
        return null;
    }
    public Bank getBank(String name){
        if(name==null) return null;
        else if(name.equals("SBI")) return new SBIBank();
        else  return new ICICIBank();
    }
}
