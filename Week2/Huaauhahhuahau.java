import java.util.Scanner;

public class Huaauhahhuahau {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
        char A[] = in.toCharArray();
        char Y[] = new char[A.length];
        char X[] = new char[A.length];
        int j = Y.length - 1;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 'a' || A[i] == 'e' || A[i] == 'i' || A[i] == 'o' || A[i] == 'u') {
                Y[j] = A[i];
                j--;
            }
        }
        j = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 'a' || A[i] == 'e' || A[i] == 'i' || A[i] == 'o' || A[i] == 'u') {
                X[j] = A[i];
                j++;
            }
        }
        String y = new String(Y);
        String x = new String(X);
        x = x.trim();
        y = y.trim();

        if (x.equals(y)) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}
