import java.util.*;
public class WeightedAverages{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0;i < n; i++) {
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            double c = scan.nextDouble();
            double d = (a * 2.0 + b * 3.0 + c * 5.0) / (2.0 + 3.0 + 5.0);
            System.out.printf("%.1f%n", d);
        }
    }
}