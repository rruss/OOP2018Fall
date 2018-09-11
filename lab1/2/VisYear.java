import java.util.Scanner;
public class VisYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        sc.close();
        if((a % 400 == 0) || (a % 4 == 0 && (a % 100 != 0))){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
