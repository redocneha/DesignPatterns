abstract class Bank{
    String name;
    abstract String getName();

}

class SBIBank extends  Bank{
    String name;
     public SBIBank(){
         this.name="SBI";
     }
    public String getName(){
       return name;
   }
}

class ICICIBank extends  Bank{
    String name;
    public ICICIBank(){
        this.name="ICICI";
    }
    public String getName(){
        return name;
    }
}