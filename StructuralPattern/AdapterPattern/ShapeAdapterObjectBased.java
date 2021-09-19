class ShapeAdapterObjectBased implements Shape{

    private GeometricShape geometricShape;

    public ShapeAdapterObjectBased(GeometricShape shape){
        this.geometricShape = shape;
    }

    public void draw(){
        geometricShape.drawShape();
    }
}