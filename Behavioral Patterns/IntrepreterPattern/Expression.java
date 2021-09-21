interface Expression{
    boolean interpret(String context);
}
class TerminalIntrepeter implements Expression{
    String data;
    public TerminalIntrepeter(String data){
        this.data = data;
    }
    @java.lang.Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
class AndIntrepreter implements Expression{
    Expression expression1 = null;
    Expression expression2 = null;

    public AndIntrepreter(Expression expression1,Expression expression2){
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @java.lang.Override
    public boolean interpret(String context) {
        return expression1.interpret(context) && expression2.interpret(context);
    }
}

class OrIntrepreter implements Expression{
    Expression expression1 = null;
    Expression expression2 = null;
 // think of expression1 and 2 as rules , whatever that comes in interpret function , has to check validation with the rules(either or / and)
    public OrIntrepreter(Expression expression1,Expression expression2){
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @java.lang.Override
    public boolean interpret(String context) {
        return expression1.interpret(context) || expression2.interpret(context);
    }
}