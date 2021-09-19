class Demo{
    public static void main(String[] args) {
        Drawing drawing  = new Drawing();
        drawing.addDrawing(new Rectange());
        drawing.addDrawing(new ShapeAdapterObjectBased(new Triangle()));
        drawing.addDrawing(new TriangleAdapter());
        drawing.draw();
    }
}