import java.util.Scanner;

public class powerof2{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        int i = 1;
        boolean q = false;

        while (i <= a){
            if (i == a){
                q = true;
                break;
            }
            i *= 2;
        }

        if (q) System.out.print("YES");

        else System.out.print("NO");



    }
}