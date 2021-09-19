interface GeometricShape{
    void drawShape();
}


class Rhombus implements GeometricShape{
    public void drawShape(){
        System.out.println("Drawing Rhombus ");
    }
}

class Triangle implements GeometricShape{
    public void drawShape(){
        System.out.println("Drawing Triangle");
    }
}