import java.util.*;
class Example{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a, b;
        System.out.println("Enter 1-number: ");
        a = sc.nextDouble();
        System.out.println("Enter 2-number: ");
        b = sc.nextDouble();

        double a2 = a * a;
        double b2 = b * b;

        double s = (a / (b2 - a * b) + b / (a2 - a * b)) * ((a * b) / (b - a));
        System.out.println(s);
    }
}