import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Grenais {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> matches = new ArrayList<>();
        int count = 0;
        int inter = 0;
        int gremio = 0;
        int emaptes = 0;

        while (true) {
            for (int i = 0; i < 2; i++)
                matches.add(scanner.nextInt());

            System.out.println("Novo grenal (1-sim 2-nao)");
            int temp = scanner.nextInt();
            if (temp == 2)
                break;
        }

        for (int i = 0; i < matches.size()/2; i++) {
            if (matches.get(count) > matches.get(count + 1))
                inter++;
            else if (matches.get(count) < matches.get(count + 1))
                gremio++;
            else
                emaptes++;
            count += 2;
        }

        System.out.println(matches.size() / 2 + " grenais");
        System.out.println("Inter:" + inter);
        System.out.println("Gremio:" + gremio);
        System.out.println("Empates:" + emaptes);
        if (inter > gremio)
            System.out.println("Inter venceu mais");
        else
            System.out.println("gremio venceu mais");
    }
}