public class Cube extends Shape3D{
    private double side;
    public Cube(){
        super();
    }

    public Cube(double side) {
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double volume() {
        return (side * side*side);
    }

    @Override
    public double area() {
        return (side * side);
    }
    @Override
    public String toString(){
        return String.format("\nArea of Cube:%.02f \nVolume of Cube:%.02f",area(),volume());
    }
}

