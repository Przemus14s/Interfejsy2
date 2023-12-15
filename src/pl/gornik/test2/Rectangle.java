package pl.gornik.test2;

public class Rectangle implements Shape {
    private double sizeA;
    private double sizeB;

    public Rectangle(double sizeA, double sizeB) {
        this.sizeA = sizeA;
        this.sizeB = sizeB;
    }

    @Override
    public double calculateArea() {
        return sizeA * sizeB;
    }
}
