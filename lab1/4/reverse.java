import java.util.Scanner;

public class reverse{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        int[] x = new int[a];

        for (int i = 0; i < a; ++i){
            x[i] = scan.nextInt();
        }

        int[] y = new int[a];

        for (int i = 0; i < a; ++i){
            y[i] = x[a - i - 1];
            System.out.print(y[i]);
            System.out.print(' ');

        }
    }
}