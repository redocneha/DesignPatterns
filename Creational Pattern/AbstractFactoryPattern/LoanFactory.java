public class LoanFactory  extends AbstractFactory{
    public Bank getBank(String bank){
        return null;
    }
    public Loan getLoan(String name){
        if(name==null) return null;
        else if(name.equals("Agri")) return new AgriLoan();
        else  return new EducationLoan();
    }
}
