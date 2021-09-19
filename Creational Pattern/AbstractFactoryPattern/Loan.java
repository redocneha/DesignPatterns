abstract class Loan{
    protected String type;
    protected double  rate;
    abstract String getLoanType();
    abstract void getInterestRate();
    public double calculateLoanRepayment(double loanAmount){
        getLoanType();
        getInterestRate();
        double totalLoan = loanAmount * (1+rate);
        System.out.println("Choosen Loan type:"+type+" Interest Rate : "+rate+" Total Loan :"+totalLoan);
        return totalLoan;
    }
}

class AgriLoan extends Loan{

    public String getLoanType(){
        return "Agriculture Loan";
    }
    public void getInterestRate(){
       rate=6.5;
    }
}

class EducationLoan extends  Loan{
    public String getLoanType(){
        return "Education Loan";
    }
    public void getInterestRate(){
        rate=5.5;
    }
}