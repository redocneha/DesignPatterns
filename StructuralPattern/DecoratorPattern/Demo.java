class Demo{
    public static void main(String args[]){
        Dress casual = new CasualDress(new BasicDress());
        casual.assemble();
        Dress fancy = new FancyDress(new SportsDress(new BasicDress()));
       fancy.assemble();
    }

}