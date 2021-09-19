class Demo{
    public static void main(String args[]){
        Dress casual = new CasualDress(new BasicDress());
        casual.assemble();
        Dress fancy = new FancyDress(new SportsDress(new BasicDress()));
       fancy.assemble();
    }
}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