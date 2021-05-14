import java.util.Scanner;
public class Uri1030 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            System.out.printf("Case %d: %d\n",i + 1, josephus(x, y) + 1);
        }
    }
    private static int josephus(int n, int k) {
        int ans = 0;
        for (int i = 2; i <= n; i++) {
            ans = (ans + k) % i;
        }
        return ans;
    }
}