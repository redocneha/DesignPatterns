import java.util.*;
class Demo{
    public static void main(String[] args) {
        System.out.println("Enter the bank name from where you want to take a loan from");
        Scanner sc = new Scanner(System.in);
        String bankName = sc.next();
        System.out.println("Bank Name"+bankName);
        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank bank =  bankFactory.getBank(bankName);
        System.out.println("Enter the type of loan you want");
        sc = new Scanner(System.in);
        String loanType= sc.next();
        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan loan = loanFactory.getLoan(loanType);
        System.out.println("Enter the loan Amount you want");
        sc = new Scanner(System.in);
        double loanAmount= sc.nextDouble();
       double totalAmount= loan.calculateLoanRepayment(loanAmount);
       System.out.println("You have to pay a total of "+totalAmount+" "+" if you plan to take a "+loan.type+" "+"from"+bankName+"for an amount of"
       +loanAmount+" with interest rate of"+loan.rate);
    }
}