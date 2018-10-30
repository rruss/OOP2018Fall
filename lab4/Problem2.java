import java.util.*;
interface CarVehicle
{
    public void run();

    public double getFuel();
}

class Car implements CarVehicle
{
    double fuel;
    Car(double fuel){
        this.fuel = fuel;
    }

    public void run()
    {
        System.out.print("Wrroooooooom");
    }


    public double getFuel()
    {
        return this.fuel;
    }
}

abstract class MotorVehicle
{
    double fuel;

    double getFuel()
    {
        return this.fuel;
    }

    abstract void run();
}

class Motorcycle extends MotorVehicle
{
    double fuel;

    Motorcycle(double fuel) {
        this.fuel = fuel;
    }
    @Override
    double getFuel() {
        return super.getFuel();
    }

    void run()
    {
        System.out.print("Wrroooooooom");
    }
}

class Problem2{
    public static void main(String args[]){
        Motorcycle mc = new Motorcycle(25);
        System.out.println(mc.getFuel());
    }
}