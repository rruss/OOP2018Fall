
import java.util.Scanner;

public class sumof100{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int cnt = 0;

        for (int i = 0; i < 100; ++i){
            cnt += scan.nextInt();
        }

        System.out.print(cnt);

    }
}