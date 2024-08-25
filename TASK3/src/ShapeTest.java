public class ShapeTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        System.out.println("Square:");
        Shape square = shapeFactory.getShape("SQUARE");
        if (square != null) {
            square.draw();
            System.out.println();
        }

        System.out.println("Circle:");
        Shape circle = shapeFactory.getShape("CIRCLE");
        if (circle != null) {
            circle.draw();
            System.out.println();
        }

        System.out.println("Triangle:");
        Shape triangle = shapeFactory.getShape("TRIANGLE");
        if (triangle != null) {
            triangle.draw();
            System.out.println();
        }

        System.out.println("Rectangle:");
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        if (rectangle != null) {
            rectangle.draw();
            System.out.println();
        }
    }
}
