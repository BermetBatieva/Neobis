import java.io.IOException;
import java.util.Scanner;

public class FlaviousJosephusLegend {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.printf("Case %d: %d\n",i + 1, jose(x, y) + 1);
        }
    }
    private static int jose(int a, int b) {
        int s = 0;
        for (int j = 2; j <= a; j++) {
            s = (s+ b) % j;
        }
        return s;
    }
}
