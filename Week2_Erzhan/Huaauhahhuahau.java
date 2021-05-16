import java.util.Scanner;

public class Huaauhahhuahau {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
        char c[] = in.toCharArray();
        char q[] = new char[c.length];
        char v[] = new char[c.length];
        int j = q.length - 1;

        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
                q[j] = c[i];
                j--;
            }
        }
        j = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
                v[j] = c[i];
                j++;
            }
        }
        String y = new String(q);
        String x = new String(v);
        x = x.trim();
        y = y.trim();

        if (x.equals(y)) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}
