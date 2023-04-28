package homeworks.hm5.subPackageShapes;

public class Round implements Shape {
    private double radius;
    private final double PI = 3.14;

    public Round(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return PI * radius * radius;
    }
}
