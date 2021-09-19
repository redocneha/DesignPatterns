interface Dress{
    void assemble();

}

class BasicDress implements Dress{
    @Override
    public void assemble(){
     System.out.println("Assembling basic dress  features");
    }
}
class DressDecorator implements Dress{
   protected Dress dress;
    public DressDecorator(Dress dress){
        this.dress = dress;
    }
    @Override
    public void assemble(){
     this.dress.assemble();
  }
}
class CasualDress extends DressDecorator{
   public CasualDress(Dress dress){
    super(dress);
   }
    @Override
    public void assemble(){
    super.assemble();
     System.out.println("Assembling Casual dress  features");
    }
}

class FancyDress extends DressDecorator{
   public FancyDress(Dress dress){
    super(dress);
   }
    @Override
    public void assemble(){
    super.assemble();
     System.out.println("Assembling Fancy dress  features");
    }
}

class SportsDress extends DressDecorator{
   public SportsDress(Dress dress){
    super(dress);
   }
    @Override
    public void assemble(){
     super.assemble();
     System.out.println("Assembling Sports dress  features");
    }
}