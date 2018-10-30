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
    int fuel;

    int getFuel()
    {
        return this.fuel;
    }

    abstract void run();
}

class Motorcycle extends MotorVehicle
{
    int fuel;

    Motorcycle(int fuel) {
        this.fuel = fuel;
    }
    @Override
    int getFuel() {
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