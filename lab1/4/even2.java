import java.util.Scanner;

public class even2{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        int[] x = new int[a];

        for (int i = 0; i < a; ++i){
            x[i] = scan.nextInt();
        }
        for (int i = 0; i < a; ++i){
            if (x[i] % 2 == 0){
                System.out.print(x[i]);
                System.out.print(' ');

            }
        }
    }
}