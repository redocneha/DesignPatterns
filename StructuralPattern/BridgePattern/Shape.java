
abstract class Shape{
  protected Color color;
  abstract public void draw();
  public Shape(Color color){
     this.color = color;
  }
}


class Square extends Shape{

   public Square(Color color){
    super(color);
   }
   @Override
  public  void draw(){
     System.out.println("Square drawn with "+color.fill());
   }
}

class Circle extends Shape{

   public Circle(Color color){
    super(color);
   }
   public void draw(){
     System.out.println("Circle drawn with "+color.fill());
   }
}