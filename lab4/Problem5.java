import java.util.*;
class Minmax {

    static class MinAndMax {
        static int max;
        static int min;

        static String print() {
            return String.format("Max: %d, Min: %d", max, min);
        }
    }

    static String minMax(int values[]) {
        MinAndMax.max = values[0];
        MinAndMax.min = values[0];

        for (int i = 1; i < values.length; ++i) {
            if (values[i] > MinAndMax.max) MinAndMax.max = values[i];

            else if (values[i] < MinAndMax.min) MinAndMax.min = values[i];
        }

        return MinAndMax.print();
    }
}

public class Problem5{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = s.nextInt();
        }

        System.out.println(Minmax.minMax(arr));
    }
}