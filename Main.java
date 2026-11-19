// Parent class
class Shape {
    public double getVolume() {
        return 0.0;
    }
}

// Subclass 1: Cube (Volume = side^3)
class Cube extends Shape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getVolume() {
        return this.side * this.side * this.side;
    }
}

// Subclass 2: Cuboid (Volume = length * width * height)
class Cuboid extends Shape {
    private double length;
    private double width;
    private double height;

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getVolume() {
        return this.length * this.width * this.height;
    }
}

// Subclass 3: Cylinder (Volume = pi * radius^2 * height)
class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}

// Main class to test encapsulated objects
public class Main {
    public static void main(String[] args) {
        Cube cube = new Cube(4.0);
        Cuboid cuboid = new Cuboid(5.0, 3.0, 2.0);
        Cylinder cylinder = new Cylinder(3.0, 7.0);

        System.out.println("Cube (side = " + cube.getSide() + ") Volume: " + cube.getVolume());
        System.out.println("Cuboid (" + cuboid.getLength() + " x " + cuboid.getWidth() + " x " + cuboid.getHeight() + ") Volume: " + cuboid.getVolume());
        System.out.println("Cylinder (radius = " + cylinder.getRadius() + ", height = " + cylinder.getHeight() + ") Volume: " + cylinder.getVolume());

        // Demonstrating setter encapsulation with `this`
        cube.setSide(6.0);
        System.out.println("Updated Cube (side = " + cube.getSide() + ") Volume: " + cube.getVolume());
    }
}
