import java.util.Scanner;

public class same2{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int cnt = 0;

        int[] x = new int[a];

        for (int i = 0; i < a; ++i){
            x[i] = scan.nextInt();
        }
        for (int i = 1; i < a - 1; ++i){
            if ( x[i] > x[i-1] &&  x[i] > x[i+1] ){
                cnt++;
            }
        }
        System.out.print(cnt);

    }
}