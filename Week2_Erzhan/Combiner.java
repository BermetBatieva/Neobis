import java.util.Scanner;

public class Combiner {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int in = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < in; i++) {
            String b = scan.nextLine();
            String[] a = b.split(" ");
            String one = a[0];
            String two = a[1];

            int min = Math.min(one.length(), two.length());
            for (int j = 0; j < min; j++) {
                System.out.print(one.charAt(j));
                System.out.print(two.charAt(j));
            }

            String max = (one.length() > two.length()) ? one : two;
            System.out.print(max.substring(min));
            System.out.println();
        }
    }
}
