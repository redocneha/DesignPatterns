class Demo{
   public static void main(String args[]){
        Shape s1 = new Square(new Blue());
        Shape s2 = new Circle(new Yellow());
        Shape square = new Square(new Blue());
        s1.draw();
        s2.draw();
   }
}
