package homeworks.hm5.subPackageShapes;

public class ShapeCollector {

    public void shapeSumAreaCounter(Shape[] shapes) {
        double shapeAreaSum = 0;
        for (Shape s : shapes) {
            shapeAreaSum += s.findArea();
        }
        shapeAreaSum = Math.round(shapeAreaSum * 100.0) / 100.0; // cut numbers after point. -> 0.00
        System.out.println(shapeAreaSum);
    }

    public static void main(String[] args) {
        Shape[] shapesArr = new Shape[3];

        shapesArr[0] = new Triangle(2.2, 4.5);
        shapesArr[1] = new Round(5.2);
        shapesArr[2] = new Square(3.6);

        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.shapeSumAreaCounter(shapesArr);

    }

}
