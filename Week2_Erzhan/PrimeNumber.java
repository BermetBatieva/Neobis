import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]){

        int N, X, j;
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        for (int i = 1; i <= N; i++) {
            X = input.nextInt();
            boolean ch =true;
            for ( j = 2; j < X; j++) {
                if (X % j == 0) {
                    ch = false;
                }
            }

            if (ch) {
                System.out.print(X +" eh primo\n");
            }else {
                System.out.print(X +" nao eh primo\n");
            }

        }

    }

}