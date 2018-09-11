import java.util.Scanner;

public class mindivisor{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        for (int i = 2; i <= a; ++i){
            if (a % i == 0){
                System.out.print(i);
                break;
            }
        }

    }
}
