import java.util.Scanner;

public class evens{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        for (int i = a; i <= b; ++i){
            if (i % 2 == 0){
                System.out.print(i);
                System.out.print(' ');

            }
        }

    }
}