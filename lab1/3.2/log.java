import java.util.Scanner;

public class log{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        int i = 1;
        int cnt = 0;

        while (i < a){

            i *= 2;
            cnt++;
        }

        System.out.print(cnt);
    }
}