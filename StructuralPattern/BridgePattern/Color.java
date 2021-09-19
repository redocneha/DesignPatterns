public interface Color{
    String fill();
}
 class Blue implements Color{

    public String fill(){
     return "Blue color filled";
    }
}
 class Yellow implements Color{

    public String fill(){
     return "Yellow color filled";
    }
}