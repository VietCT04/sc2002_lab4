package sc2002_lab4;

public class Cuboid implements Shape {
    private double length;
    private double width;
    private double height;

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 2 * (length * width + width * height + height * length);
    }
}
