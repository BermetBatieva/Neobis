import java.io.IOException;
import java.util.Scanner;

public class PopulationIncrease {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int T = leitor.nextInt();
        int PA, PB, anos;
        double G1, G2;
        for (int i = 1; i <= T; i++) {
            anos = 0;
            PA = leitor.nextInt();
            PB = leitor.nextInt();
            G1 = leitor.nextDouble();
            G2 = leitor.nextDouble();
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