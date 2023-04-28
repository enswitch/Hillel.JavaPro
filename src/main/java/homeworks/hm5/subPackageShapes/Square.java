package homeworks.hm5.subPackageShapes;

import homeworks.hm5.subPackageShapes.Shape;

public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double findArea() {
        return side * side;
    }
}
