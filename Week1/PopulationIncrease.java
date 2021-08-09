import java.io.IOException;
import java.util.Scanner;

public class PopulationIncrease {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int PA, PB, anos;
        double G1, G2;
        for (int i = 1; i <= T; i++) {
            anos = 0;
            PA = scanner.nextInt();
            PB = scanner.nextInt();
            G1 = scanner.nextDouble();
            G2 = scanner.nextDouble();
            while (PB >= PA) {
                PA += (PA * G1) / 100;
                PB += (PB * G2) / 100;
                anos++;
                if (anos > 100) {
                    break;
                }
            }
            System.out.println((anos <= 100) ? anos + " anos." : "Mais de 1 seculo.");
        }
    }

}