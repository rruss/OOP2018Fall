import java.util.Scanner;
public class MaxOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        if(a > b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }
}
