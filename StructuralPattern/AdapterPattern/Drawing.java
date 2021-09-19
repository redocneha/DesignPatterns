import java.util.*;
class Drawing{
    List<Shape> shapesList = new ArrayList<>();
    public void addDrawing(Shape s){
        shapesList.add(s);
    }
    public void draw(){
        shapesList.stream().forEach(shape -> shape.draw());
    }
}
