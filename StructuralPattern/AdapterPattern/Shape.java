interface Shape{
    void draw();
}


class Rectange implements Shape{
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}

class Circle implements Shape{
    public void draw(){
        System.out.println("Drawing Circle");
    }
}