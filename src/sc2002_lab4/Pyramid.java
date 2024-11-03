package sc2002_lab4;

public class Pyramid implements Shape {
    private double baseLength;
    private double height;

    public Pyramid(double baseLength, double height) {
        this.baseLength = baseLength;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double slantHeight = Math.sqrt((baseLength / 2) * (baseLength / 2) + height * height);
        return (baseLength * baseLength) + 2 * baseLength * slantHeight;
    }
}
