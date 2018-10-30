import java.util.*;
interface Movable {
    double MOV_COEF = 1;

    boolean isMoving();

    double getVelocity();
}

interface Runnable extends Movable {
    double RUN_COEF = 1.4;

    boolean isRunning();
}

class Runner implements Runnable {
    private double speed;

    public Runner(double speed){
        this.speed = speed;
    }

    public void setSpeed(double speed) { this.speed = speed; }
    public double getSpeed() { return speed; }

    @Override
    public boolean isMoving() {
        return speed  < 5;
    }

    @Override
    public boolean isRunning() {
        return speed > 5;
    }

    @Override
    public double getVelocity() {
        if (speed > 5) return speed / RUN_COEF;

        else return speed / MOV_COEF;
    }
}

public class Problem4{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Runner r1 = new Runner(8.4);

        System.out.println(r1.isMoving());
        System.out.println(r1.isRunning());
        System.out.println(r1.getVelocity());

        Runner r2 = new Runner(4);

        System.out.println(r2.isMoving());
        System.out.println(r2.isRunning());
        System.out.println(r2.getVelocity());
    }
}