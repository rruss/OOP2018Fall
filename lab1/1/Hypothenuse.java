import java.util.Scanner;
    public class Hypothenuse {

        public static void main(String[] args) {
            int a, b;
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            b = sc.nextInt();
            sc.close();
            double c = Math.sqrt(a * a + b * b);
            System.out.println(c);

        }
    }
