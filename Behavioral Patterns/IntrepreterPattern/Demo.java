class Demo{
    public static Expression getMaleExpression(){
        Expression john = new TerminalIntrepeter("John");
        Expression robert = new TerminalIntrepeter("Robert");
        return new OrIntrepreter(john,robert);
    }
    public static Expression getMarriedWomanExpression(){
        Expression name = new TerminalIntrepeter("Nisha");
        Expression married = new TerminalIntrepeter("married");
        return new AndIntrepreter(name,married);
    }
    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isNishaMarried = getMarriedWomanExpression();
        System.out.println("Is John male?"+isMale.interpret("John"));
        System.out.println("Is Nisha married?"+isNishaMarried.interpret("Nisha married"));
    }
}