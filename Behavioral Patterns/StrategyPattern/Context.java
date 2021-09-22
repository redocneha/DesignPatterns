class Context{
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public int calculate(int a, int b){
       return strategy.calculate(a,b);
    }
}