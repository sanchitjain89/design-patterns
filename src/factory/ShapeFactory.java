package factory;

// Factory Class
class ShapeFactory {
    // Factory method with input
    public Shape createShape(String shapeType) {
        if (shapeType == null || shapeType.isEmpty()) {
            throw new IllegalArgumentException("Shape type must be provided.");
        }
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else {
            throw new IllegalArgumentException("Unknown shape type: " + shapeType);
        }
    }
}
