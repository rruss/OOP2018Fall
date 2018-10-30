import java.util.*;
interface Shapes{
    double volume(Object o);
    double surfaceArea(Object o);
}

class Cylinder implements Shapes{
    private double height;
    private double radius;
    private double volume;
    private double surfaceArea;
    Cylinder(){
    }
    Cylinder(double height, double radius){
        this.height = height;
        this.radius = radius;
    }


    @Override
    public double volume(Object o) {
        Cylinder c = (Cylinder) o;
        c.volume = c.height * c.radius * c.radius * Math.PI;
        return c.volume;
    }

    @Override
    public double surfaceArea(Object o) {
        Cylinder c = (Cylinder) o;
        c.surfaceArea = c.height * 2 * Math.PI * c.radius + 2 * Math.PI * c.radius * c.radius;
        return c.surfaceArea;
    }
}

class Sphere implements Shapes{
    private double radius;
    private double volume;
    private double surfaceArea;
    Sphere(){}
    Sphere(double radius){
        this.radius = radius;
    }

    @Override
    public double volume(Object o) {
        Sphere s = (Sphere) o;
        volume = 4 / 3 * Math.PI * s.radius * s.radius * s.radius;
        return volume;
    }

    @Override
    public double surfaceArea(Object o) {
        Sphere s = (Sphere) o;
        surfaceArea = 4 * Math.PI * s.radius * s.radius;
        return surfaceArea;
    }
}

class Cube implements Shapes{
    private double side;
    private double volume;
    private double surfaceArea;
    Cube(){}
    Cube(double side){
        this.side = side;
    }

    @Override
    public double volume(Object o) {
        Cube c = (Cube) o;
        volume = c.side * c.side * c.side;
        return volume;
    }

    @Override
    public double surfaceArea(Object o) {
        Cube c = (Cube) o;
        surfaceArea = 6 * c.side * c.side;
        return surfaceArea;
    }
}
class Point implements Shapes{
    private double x;
    private double y;
    private double volume;
    private double surfaceArea;

    Point(){}
    Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    @Override
    public double volume(Object o) {
        Point p  = (Point) o;
        p.volume = 0;
        return p.volume;
    }

    @Override
    public double surfaceArea(Object o) {
        Point p  = (Point) o;
        p.surfaceArea = 0;
        return p.surfaceArea;
    }
}

class Problem1{
    public void main(String args[]){
        Point p = new Point(1,2);
        System.out.println(p.surfaceArea(p));
    }
}