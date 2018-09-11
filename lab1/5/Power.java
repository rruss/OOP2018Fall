import java.util.Scanner;

public class Power {
    static double powe(double a, int b){
        double powe = Math.pow(a, b);
        return powe;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        int b;
        a = sc.nextDouble();
        b = sc.nextInt();
        System.out.println(powe(a,b));

    }
}
