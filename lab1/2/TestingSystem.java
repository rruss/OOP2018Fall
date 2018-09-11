import java.util.Scanner;
public class TestingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        if((a == 1 && b == 1) || (a != 1 && b != 1)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
