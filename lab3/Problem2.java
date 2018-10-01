import java.util.*;

abstract class Shapes{
    private double volume;
    private double surfaceArea;

    public abstract String volume();
    public abstract String surfaceArea();
}

class Cylinder extends Shapes {
    private double height;
    private double radius;
    Cylinder(){
    }
    Cylinder(double height, double radius){
        this.height = height;
        this.radius = radius;
    }


    public String volume() {
        return "Volume of cylinder " + (this.height * Math.PI * this.radius * this.radius);
    }

    @Override
    public String surfaceArea() {
        return "Surface Area of cylinder " +
                (this.height * 2 * Math.PI * this.radius + 2 * Math.PI * this.radius * this.radius);
    }
}

class Sphere extends Shapes{
    private double radius;
    Sphere(){
    }
    Sphere(double height){
        this.radius = radius;
    }

    public String volume() {
        return "Volume of sphere " + (4 / 3 * Math.PI * this.radius * this.radius * this.radius);
    }

    @Override
    public String surfaceArea() {
        return "Surface Area of sphere " + (4 * Math.PI * this.radius * this.radius);
    }
}

class Cube extends Shapes{
    private double side;
    Cube(){
    }
    Cube(double side){
        this.side = side;
    }

    public String volume() {
        return "Volume of cube " + (side * side * side);
    }

    @Override
    public String surfaceArea() {
        return "Surface Area of cube " + (6 * this.side * this.side);
    }
}

class Problem2{
    public static void main(String[] args){
        Cylinder cylinder = new Cylinder(10, 2);
        System.out.println(cylinder.volume());
        System.out.println(cylinder.surfaceArea());
    }

}